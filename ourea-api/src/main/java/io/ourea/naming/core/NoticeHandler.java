package io.ourea.naming.core;

import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/17
 */
public interface NoticeHandler {

    void notifyRegister(Instance instance);

    void notifyUnregister(Instance instance);

    void notifyHeartbeat(Session session);
}
