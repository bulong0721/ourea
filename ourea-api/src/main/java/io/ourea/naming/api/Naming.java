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
    /**
     *  注册服务实例
     *
     * @param serviceName
     * @param instance
     * @throws NamingException
     */
    void register(String serviceName, Instance instance) throws NamingException;

    /**
     *  注销服务实例
     *
     * @param serviceName
     * @param instance
     * @throws NamingException
     */
    void unregister(String serviceName, Instance instance) throws NamingException;

    /**
     * 查询服务所有实例
     *
     * @param serviceName
     * @return
     * @throws NamingException
     */
    default Set<Instance> lookup(String serviceName) throws NamingException {
        return lookup(serviceName, false);
    }

    /**
     * 查询服务实例，是否从服务器立即查询
     *
     * @param serviceName
     * @param immediate
     * @return
     * @throws NamingException
     */
    Set<Instance> lookup(String serviceName, boolean immediate) throws NamingException;

    /**
     * 批量查询
     *
     * @param services
     * @return
     * @throws NamingException
     */
    Map<String, Set<Instance>> lookup(Set<String> services) throws NamingException;
}
