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

    Map<String, Long> services();

    Map<String, ? extends Set<Instance>> instances();

    Map<String, Session> sessions();

    Set<Instance> lookup(String serviceName, boolean healthy) throws NamingException;

    boolean combine(Instance instance) throws NamingException;

    boolean remove(Instance instance) throws NamingException;

    boolean healthy(Instance instance);

    void ping(Session session) throws NamingException;
}
