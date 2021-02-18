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

    Session ping(Heartbeat heartbeat) throws NamingException;

}
