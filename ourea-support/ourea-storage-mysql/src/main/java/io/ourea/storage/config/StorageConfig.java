package io.ourea.storage.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/18
 */
@Configuration
@MapperScan("io.ourea.storage.mapper")
public class StorageConfig {

}
