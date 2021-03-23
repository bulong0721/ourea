package io.ourea.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = {"io.ourea"})
public class AdapterApp {

    public static void main(String[] args) {
        SpringApplication.run(AdapterApp.class, args);
    }
}
