package io.ourea.naming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/1/27
 */
@EnableScheduling
@SpringBootApplication
public class NamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NamingServerApplication.class, args);
    }
}
