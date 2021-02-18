package io.ourea.naming;

import io.ourea.naming.api.NamingClient;
import io.ourea.naming.exception.NamingException;
import io.ourea.naming.feign.NamingService;
import io.ourea.naming.feign.NotificationService;
import io.ourea.naming.http.ResponseEntity;
import io.ourea.naming.listener.EventListener;
import io.ourea.naming.listener.ServiceChangeEvent;
import io.ourea.naming.pojo.Heartbeat;
import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;
import io.ourea.naming.vo.NoticeVO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/7
 */
public class DefaultClient implements NamingClient {
    private Map<String, ServiceListener> listenerMap = new ConcurrentHashMap<>();
    private Map<String, Set<Instance>> instanceMap = new ConcurrentHashMap<>();
    private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private final ClientConfig config;
    private NamingService naming;
    private NotificationService notification;

    public DefaultClient(ClientConfig config) {
        this.config = config;
    }

    @Override
    public String getId() {
        return config.getClientId();
    }

    protected void touch(Entry entry) {
        entry.signByClient(getId());
        entry.touch();
    }

    @Override
    public void startup() throws NamingException {
        this.notification = config.createService(NotificationService.class);
        this.naming = config.createService(NamingService.class, 1000, 3000);
        this.scheduler.schedule(new PollingTask(), 1, TimeUnit.SECONDS);
    }

    @Override
    public void shutdown() throws NamingException {
        scheduler.shutdown();
    }

    private <T> T extract(ResponseEntity<T> entity) throws NamingException {
        if (!entity.success()) {
            throw new NamingException(entity.getMessage());
        }
        return entity.getData();
    }

    @Override
    public void register(String serviceName, Instance instance) throws NamingException {
        this.touch(instance);
        extract(naming.register(serviceName, instance));
    }

    @Override
    public void unregister(String serviceName, Instance instance) throws NamingException {
        this.touch(instance);
        extract(naming.unregister(serviceName, instance));
    }

    @Override
    public void subscribe(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException {
        ServiceListener serviceListener = listenerMap.computeIfAbsent(serviceName, key -> new ServiceListener());
        serviceListener.addListener(listener);
    }

    @Override
    public void unsubscribe(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException {
        ServiceListener serviceListener = listenerMap.computeIfAbsent(serviceName, key -> new ServiceListener());
        serviceListener.removeListener(listener);
    }

    @Override
    public Session ping(Heartbeat heartbeat) throws NamingException {
        return extract(naming.ping(getId()));
    }

    @Override
    public Set<Instance> lookup(String serviceName, boolean immediate) throws NamingException {
        Set<Instance> instances = extract(naming.lookup(serviceName));
        instanceMap.put(serviceName, instances);
        return instances;
    }

    @Override
    public Map<String, Set<Instance>> lookup(Set<String> services) throws NamingException {
        Map<String, Set<Instance>> result = extract(naming.lookup(services));
        for (Map.Entry<String, Set<Instance>> entry : result.entrySet()) {
            String serviceName = entry.getKey();
            Set<Instance> instances = entry.getValue();
            instanceMap.put(serviceName, instances);
        }
        return result;
    }

    @Data
    static class ServiceListener {
        private List<EventListener<ServiceChangeEvent>> listeners = new ArrayList<>();
        private long timestamp;

        public void handleChange(String serviceName, Set<Instance> instances) {
            ServiceChangeEvent event = new ServiceChangeEvent();
            event.setService(serviceName);
            event.setInstances(instances);
            listeners.stream()
                    .forEach(listener -> listener.onEvent(event));
        }

        public void addListener(EventListener<ServiceChangeEvent> listener) {
            listeners.add(listener);
        }

        public void removeListener(EventListener<ServiceChangeEvent> listener) {
            listeners.remove(listener);
        }
    }

    class PollingTask implements Runnable {

        @Override
        public void run() {
            try {
                List<NoticeVO> noticeVOS = new ArrayList<>();
                for (Map.Entry<String, ServiceListener> entry : listenerMap.entrySet()) {
                    String serviceName = entry.getKey();
                    ServiceListener listener = entry.getValue();
                    NoticeVO noticeVO = new NoticeVO();
                    noticeVO.setServiceName(serviceName);
                    noticeVO.setTimestamp(listener.getTimestamp());
                    noticeVOS.add(noticeVO);
                }
                if (noticeVOS.isEmpty()) {
                    Thread.sleep(500L);
                    return;
                }
                notification.longPolling(getId(), noticeVOS)
                        .stream()
                        .forEach(noticeVO -> {
                            String serviceName = noticeVO.getServiceName();
                            long timestamp = noticeVO.getTimestamp();
                            ServiceListener listener = listenerMap.get(serviceName);
                            listener.setTimestamp(timestamp);
                            Set<Instance> instances = noticeVO.getInstances();
                            instanceMap.put(serviceName, instances);
                            listener.handleChange(serviceName, instances);
                        });
            } catch (InterruptedException e) {
            } finally {
                scheduler.submit(new PollingTask());
            }
        }
    }
}
