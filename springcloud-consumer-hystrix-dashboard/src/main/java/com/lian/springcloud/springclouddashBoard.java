package com.lian.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @author Lian
 */
@SpringBootApplication
@EnableHystrixDashboard
public class springclouddashBoard {
    public static void main(String[] args) {
        SpringApplication.run(springclouddashBoard.class,args);
    }


}
