package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer_7004Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer_7004Application.class, args);
    }

}
