package io.ourea.naming.service.impl;

import io.ourea.naming.core.Database;
import io.ourea.naming.exception.NamingException;
import io.ourea.naming.pojo.Heartbeat;
import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;
import org.eclipse.collections.impl.map.mutable.ConcurrentHashMap;
import org.eclipse.collections.impl.set.mutable.UnifiedSet;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/3
 */
public class DefaultDatabase implements Database {
    private ConcurrentMap<String, Long> serviceMap = new ConcurrentHashMap<>();
    private ConcurrentMap<String, UnifiedSet<Instance>> instanceMap = new ConcurrentHashMap<>();
    private ConcurrentMap<String, Session> sessionMap = new ConcurrentHashMap<>();

    @Override
    public Map<String, Long> services() {
        return serviceMap;
    }

    @Override
    public Map<String, ? extends Set<Instance>> instances() {
        return instanceMap;
    }

    @Override
    public Map<String, Session> sessions() {
        return sessionMap;
    }

    @Override
    public Set<Instance> lookup(String serviceName, boolean healthy) throws NamingException {
        UnifiedSet<Instance> instances = getInstances(serviceName);
        if (healthy) {
            return instances.select(this::healthy);
        }
        return instances;
    }

    @Override
    public boolean combine(Instance instance) throws NamingException {
        String serviceName = instance.getServiceName();
        UnifiedSet<Instance> instances = getInstances(serviceName);
        Instance old = instances.get(instance);
        boolean combined = false;
        if (null == old) {
            instances.put(instance);
            combined = true;
        } else {
            combined = old.merge(instance);
        }
        if (combined) {
            serviceMap.put(serviceName, instance.getSignature().getTimestamp());
        }
        return combined;
    }

    private UnifiedSet<Instance> getInstances(String serviceName) {
        return this.instanceMap.computeIfAbsent(serviceName, key -> UnifiedSet.newSet());
    }

    @Override
    public boolean remove(Instance instance) throws NamingException {
        String serviceName = instance.getServiceName();
        UnifiedSet<Instance> instances = getInstances(serviceName);
        Instance old = instances.get(instance);
        boolean removed = false;
        if (null == old || old.compareTo(instance) > 0) {
            removed = false;
        } else {
            removed = instances.remove(instance);
        }
        if (removed) {
            serviceMap.put(serviceName, instance.getSignature().getTimestamp());
        }
        return removed;
    }

    @Override
    public boolean healthy(Instance instance) {
        return true;
    }

    @Override
    public Session ping(Heartbeat heartbeat) throws NamingException {
        return null;
    }

    @Override
    public void ping(Session session) throws NamingException {

    }
}
