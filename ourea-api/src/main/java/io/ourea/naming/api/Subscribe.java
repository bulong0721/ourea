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
    /**
     * 服务订阅，使用长轮询
     *
     * @param serviceName
     * @param listener
     * @throws NamingException
     */
    void subscribe(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException;

    /**
     * 取消订阅服务
     *
     * @param serviceName
     * @param listener
     * @throws NamingException
     */
    void unsubscribe(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException;

    /**
     * 服务查询，并添加服务订阅
     *
     * @param serviceName
     * @param listener
     * @return
     * @throws NamingException
     */
    Set<Instance> lookup(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException;
}
