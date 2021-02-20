package io.ourea.naming;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
public interface Endpoint {
    /**
     * 终端类型
     */
    enum Type {
        /**
         * 服务端
         */
        SERVER,
        /**
         * 客户端
         */
        CLIENT;
    }

    /**
     * 终端类型
     *
     * @return
     */
    Type endpointType();

    /**
     * 终端ID
     *
     * @return
     */
    String getId();
}
