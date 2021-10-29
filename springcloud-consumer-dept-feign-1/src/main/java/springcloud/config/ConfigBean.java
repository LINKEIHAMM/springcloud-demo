package springcloud.config;
import com.lian.springcloud.pojo.Dept;
import com.lian.springcloud.service.DeptClientService;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Lian
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


//    @Bean
//    public DeptClientService deptClientService(){
//        return new DeptClientService() {
//            @Override
//            public Dept queryById(Long id) {
//                return null;
//            }
//
//            @Override
//            public List<Dept> queryAll() {
//                return null;
//            }
//
//            @Override
//            public Boolean add(Dept dept) {
//                return null;
//            }
//        };
//    }


//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }
}
