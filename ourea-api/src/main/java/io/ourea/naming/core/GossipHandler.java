package io.ourea.naming.core;

import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/7
 */
public interface GossipHandler extends NoticeHandler {

    /**
     * 处理服务器节点间的注册数据同步
     *
     * @param instance
     */
    void handleRegister(Instance instance);

    /**
     * 处理服务器节点间的注销数据同步
     *
     * @param instance
     */
    void handleUnregister(Instance instance);

    /**
     * 处理服务器节点间心跳数据同步
     *
     * @param session
     */
    void handleHeartbeat(Session session);

    /**
     * 处理服务器节点宕机事件
     *
     * @param serverId
     */
    void handleServerLeave(String serverId);

}
