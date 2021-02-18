package io.ourea.naming.core;

import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/7
 */
public interface GossipHandler extends NoticeHandler {

    void handleRegister(Instance instance);

    void handleUnregister(Instance instance);

    void handleHeartbeat(Session session);

    void handleServerLeave(String serverId);

}
