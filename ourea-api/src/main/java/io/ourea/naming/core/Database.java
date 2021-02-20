package io.ourea.naming.core;

import io.ourea.naming.api.Supervise;
import io.ourea.naming.exception.NamingException;
import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;

import java.util.Map;
import java.util.Set;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
public interface Database extends Supervise {

    /**
     * 服务列表 键：服务名，值：最后更新时间（注册，注销时更新）
     *
     * @return
     */
    Map<String, Long> services();

    /**
     * 服务实例
     *
     * @return
     */
    Map<String, ? extends Set<Instance>> instances();

    /**
     * 会话列表 键：客户端ID，值：会话实体
     *
     * @return
     */
    Map<String, Session> sessions();

    /**
     * 服务查询
     *
     * @param serviceName
     * @param healthy 是否进行健康检测
     * @return
     * @throws NamingException
     */
    Set<Instance> lookup(String serviceName, boolean healthy) throws NamingException;

    /**
     * 合并服务实例实体（从其他节点同步）
     *
     * @param instance
     * @return
     * @throws NamingException
     */
    boolean combine(Instance instance) throws NamingException;

    /**
     * 移除服务实例
     *
     * @param instance
     * @return
     * @throws NamingException
     */
    boolean remove(Instance instance) throws NamingException;

    /**
     * 健康检测（根据实例）
     *
     * @param instance
     * @return
     */
    boolean healthy(Instance instance);

    /**
     * 向服务端发送心跳包（考虑使用长轮询替代）
     *
     * @param session
     * @throws NamingException
     */
    void ping(Session session) throws NamingException;
}
