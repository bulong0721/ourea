package io.ourea.naming.service.impl;

import io.ourea.naming.Entry;
import io.ourea.naming.core.Database;
import io.ourea.naming.core.NamingServer;
import io.ourea.naming.core.NoticeHandler;
import io.ourea.naming.exception.NamingException;
import io.ourea.naming.pojo.Heartbeat;
import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;
import io.ourea.naming.service.ServerConfig;
import io.ourea.naming.vo.MemberVO;
import io.scalecube.cluster.ClusterImpl;
import io.scalecube.net.Address;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/3
 */
public class DefaultServer implements NamingServer, InitializingBean {
    private final Database database;
    private final ServerConfig config;
    private ClusterImpl cluster;
    private MultiHandler multiHandler = new MultiHandler();

    public DefaultServer(ServerConfig config, ClusterImpl cluster, Database database, ObjectProvider<NoticeHandler> provider) {
        this.config = config;
        this.database = database;
        ServerConfig.Cluster configCluster = config.getCluster();
        FastList<Address> addresses = configCluster.getSeedMembers().collect(Address::from);
        provider.stream()
                .forEach(multiHandler::addHandler);
        this.cluster = cluster
                .membership(opts -> opts.seedMembers(addresses))
                .membership(opts -> opts.namespace(configCluster.getNamespace()))
                .transport(opts -> opts.port(configCluster.getPort()))
                .handler(c -> {
                    ClusterHandler handler = new ClusterHandler(database, c);
                    multiHandler.addHandler(handler);
                    return handler;
                });
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.cluster.startAwait();
    }

    protected void touch(Entry entry) {
        if (null != entry) {
            entry.signByServer(getId());
            entry.touch();
        }
    }

    @Override
    public void register(String serviceName, Instance instance) throws NamingException {
        this.touch(instance);
        if (database.combine(instance)) {
            multiHandler.notifyRegister(instance);
        }
    }

    @Override
    public void unregister(String serviceName, Instance instance) throws NamingException {
        this.touch(instance);
        if (database.remove(instance)) {
            multiHandler.notifyUnregister(instance);
        }
    }

    @Override
    public Set<Instance> lookup(String serviceName, boolean immediate) throws NamingException {
        return database.lookup(serviceName, true);
    }

    @Override
    public Map<String, Set<Instance>> lookup(Set<String> services) throws NamingException {
        return services.stream()
                .collect(Collectors.toMap(key -> key, key -> lookup(key, true)));
    }

    @Override
    public Session ping(Heartbeat heartbeat) throws NamingException {
        heartbeat.signByServer(getId());
        heartbeat.touch();
        Session session = database.ping(heartbeat);
        multiHandler.notifyHeartbeat(session);
        return session;
    }

    @Override
    public String getId() {
        return cluster.member().id();
    }

    @Scheduled(initialDelay = 600000, fixedDelay = 30000)
    protected void cleanExpired() {

    }

    @Override
    public Collection<MemberVO> aliveMembers() {
        return cluster.members()
                .stream()
                .map(member -> {
                    MemberVO vo = new MemberVO();
                    return vo;
                })
                .collect(Collectors.toList());
    }

    static class MultiHandler implements NoticeHandler {
        private List<NoticeHandler> handlers = new ArrayList<>();

        public void addHandler(NoticeHandler handler) {
            handlers.add(handler);
        }

        public void removeHandler(NoticeHandler handler) {
            handlers.remove(handler);
        }

        @Override
        public void notifyRegister(Instance instance) {
            for (NoticeHandler handler : handlers) {
                handler.notifyRegister(instance);
            }
        }

        @Override
        public void notifyUnregister(Instance instance) {
            for (NoticeHandler handler : handlers) {
                handler.notifyUnregister(instance);
            }
        }

        @Override
        public void notifyHeartbeat(Session session) {
            for (NoticeHandler handler : handlers) {
                handler.notifyHeartbeat(session);
            }
        }
    }
}
