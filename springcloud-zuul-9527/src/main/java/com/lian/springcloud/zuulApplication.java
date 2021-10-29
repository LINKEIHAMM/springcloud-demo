package com.lian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Lian
 */
@SpringBootApplication
@EnableZuulProxy
public class zuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(zuulApplication.class,args);
    }
}
