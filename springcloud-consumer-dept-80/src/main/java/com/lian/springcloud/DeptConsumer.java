package com.lian.springcloud;

import com.lian.myrule.LianRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Lian
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT")
public class DeptConsumer {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer.class,args);
    }
}
