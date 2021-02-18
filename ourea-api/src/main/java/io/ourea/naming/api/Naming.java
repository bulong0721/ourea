package io.ourea.naming.api;

import io.ourea.naming.exception.NamingException;
import io.ourea.naming.pojo.Instance;

import java.util.Map;
import java.util.Set;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
public interface Naming {
    void register(String serviceName, Instance instance) throws NamingException;

    void unregister(String serviceName, Instance instance) throws NamingException;

    default Set<Instance> lookup(String serviceName) throws NamingException {
        return lookup(serviceName, false);
    }

    Set<Instance> lookup(String serviceName, boolean immediate) throws NamingException;

    Map<String, Set<Instance>> lookup(Set<String> services) throws NamingException;
}
