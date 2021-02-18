package io.ourea.naming.config;

import io.ourea.naming.core.Database;
import io.ourea.naming.core.NamingServer;
import io.ourea.naming.core.NoticeHandler;
import io.ourea.naming.service.ServerConfig;
import io.ourea.naming.service.impl.DefaultDatabase;
import io.ourea.naming.service.impl.DefaultServer;
import io.scalecube.cluster.ClusterConfig;
import io.scalecube.cluster.ClusterImpl;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/3
 */
@Configuration
public class NamingConfiguration {

    @Bean
    public Database database() {
        return new DefaultDatabase();
    }

    @Bean
    public ClusterImpl cluster() {
        ClusterConfig config = ClusterConfig.defaultConfig();
        return new ClusterImpl(config);
    }

    @Bean
    public NamingServer namingServer(Database database, ClusterImpl cluster, ServerConfig config, ObjectProvider<NoticeHandler> provider) {
        return new DefaultServer(config, cluster, database, provider);
    }
}
