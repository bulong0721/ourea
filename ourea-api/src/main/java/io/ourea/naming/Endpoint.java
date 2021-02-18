package io.ourea.naming;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
public interface Endpoint {
    enum Type {
        SERVER,
        CLIENT;
    }

    Type endpointType();

    String getId();
}
