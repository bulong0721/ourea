package io.ourea.naming.service.impl;

import io.ourea.naming.core.Database;
import io.ourea.naming.core.GossipHandler;
import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;
import io.scalecube.cluster.Cluster;
import io.scalecube.cluster.ClusterMessageHandler;
import io.scalecube.cluster.Member;
import io.scalecube.cluster.membership.MembershipEvent;
import io.scalecube.cluster.transport.api.Message;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/7
 */
public class ClusterHandler implements ClusterMessageHandler, GossipHandler {
    private final Database database;
    private final Cluster cluster;

    public ClusterHandler(Database database, Cluster cluster) {
        this.database = database;
        this.cluster = cluster;
    }

    @Override
    public void onGossip(Message gossip) {
        String operation = gossip.header(OPERATION);
        if (HEADER_REGISTER.equalsIgnoreCase(operation)) {
            handleRegister(gossip.data());
        } else if (HEADER_UNREGISTER.equalsIgnoreCase(operation)) {
            handleUnregister(gossip.data());
        } else if (HEADER_HEARTBEAT.equalsIgnoreCase(operation)) {
            handleHeartbeat(gossip.data());
        }
    }

    @Override
    public void onMembershipEvent(MembershipEvent event) {
        if (event.isRemoved()) {
            Member member = event.member();
            // TODO
        }
    }

    @Override
    public void handleRegister(Instance instance) {
        database.combine(instance);
    }

    @Override
    public void handleUnregister(Instance instance) {
        database.remove(instance);
    }

    @Override
    public void handleHeartbeat(Session session) {
        database.ping(session);
    }

    @Override
    public void handleServerLeave(String serverId) {

    }

    @Override
    public void notifyRegister(Instance instance) {
        Message message = Message.withData(instance)
                .header(OPERATION, HEADER_REGISTER)
                .build();
        cluster.spreadGossip(message).subscribe();
    }

    @Override
    public void notifyUnregister(Instance instance) {
        Message message = Message.withData(instance)
                .header(OPERATION, HEADER_UNREGISTER)
                .build();
        cluster.spreadGossip(message).subscribe();
    }

    @Override
    public void notifyHeartbeat(Session session) {
        Message message = Message.withData(session)
                .header(OPERATION, HEADER_HEARTBEAT)
                .build();
        cluster.spreadGossip(message).subscribe();
    }

    private static final String OPERATION = "/norn/operation";
    private static final String HEADER_REGISTER = "/register";
    private static final String HEADER_UNREGISTER = "/unregister";
    private static final String HEADER_HEARTBEAT = "/heartbeat";
}
