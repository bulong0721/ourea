package io.ourea.naming.service;

import lombok.Data;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/7
 */
@Data
@Component
@ConfigurationProperties(prefix = "ourea.server")
public class ServerConfig {
    private Cluster cluster;

    @Data
    public static class Cluster {
        private String namespace;
        private int port;
        private FastList<String> seedMembers;
    }
}
