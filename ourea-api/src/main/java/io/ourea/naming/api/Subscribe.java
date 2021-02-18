package io.ourea.naming.api;

import io.ourea.naming.exception.NamingException;
import io.ourea.naming.listener.EventListener;
import io.ourea.naming.listener.ServiceChangeEvent;
import io.ourea.naming.pojo.Instance;

import java.util.Set;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
public interface Subscribe {
    void subscribe(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException;

    void unsubscribe(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException;

    Set<Instance> lookup(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException;
}
