package io.ourea.naming.api;

import io.ourea.naming.exception.NamingException;
import io.ourea.naming.pojo.Heartbeat;
import io.ourea.naming.pojo.Session;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
public interface Supervise {

    /**
     * 发送心跳包，考虑使用长轮询替代
     *
     * @param heartbeat
     * @return
     * @throws NamingException
     */
    Session ping(Heartbeat heartbeat) throws NamingException;
}
