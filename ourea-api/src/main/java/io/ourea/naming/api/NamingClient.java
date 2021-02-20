package io.ourea.naming.api;

import io.ourea.naming.Endpoint;
import io.ourea.naming.exception.NamingException;
import io.ourea.naming.listener.EventListener;
import io.ourea.naming.listener.ServiceChangeEvent;
import io.ourea.naming.pojo.Instance;

import java.util.Set;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/7
 */
public interface NamingClient extends Endpoint, Naming, Subscribe, Supervise {

    @Override
    default Type endpointType() {
        return Type.CLIENT;
    }

    @Override
    default Set<Instance> lookup(String serviceName, EventListener<ServiceChangeEvent> listener) throws NamingException {
        subscribe(serviceName, listener);
        return lookup(serviceName);
    }

    /**
     * 初始化注册中心客户端
     *
     * @throws NamingException
     */
    void startup() throws NamingException;

    /**
     * 关闭注册中心客户端
     *
     * @throws NamingException
     */
    void shutdown() throws NamingException;
}
