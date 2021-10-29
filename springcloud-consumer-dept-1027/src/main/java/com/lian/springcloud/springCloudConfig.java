package com.lian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Lian
 */
@SpringBootApplication
@EnableConfigServer
public class springCloudConfig {
    public static void main(String[] args) {
        SpringApplication.run(springCloudConfig.class,args);
    }
}
