package io.ourea.naming.core;

import io.ourea.naming.Endpoint;
import io.ourea.naming.api.Naming;
import io.ourea.naming.api.Supervise;
import io.ourea.naming.vo.MemberVO;

import java.util.Collection;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/7
 */
public interface NamingServer extends Endpoint, Naming, Supervise {

    @Override
    default Type endpointType() {
        return Type.SERVER;
    }

    Collection<MemberVO> aliveMembers();
}
