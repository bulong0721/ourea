package io.ourea.naming.core;

import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/17
 */
public interface NoticeHandler {

    /**
     * 发送服务器节点注册事件
     *
     * @param instance
     */
    void notifyRegister(Instance instance);

    /**
     * 发送服务器节点注销事件
     *
     * @param instance
     */
    void notifyUnregister(Instance instance);

    /**
     * 发送服务器节点心跳事件
     *
     * @param session
     */
    void notifyHeartbeat(Session session);
}
