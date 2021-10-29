package springcloud.config;

import com.lian.springcloud.pojo.Dept;
import com.lian.springcloud.service.DeptClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author Lian
 */
@Configuration
public class BeanConfig {
    @Bean
    public DeptClientService getDeptClientService(){
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                return null;
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Boolean add(Dept dept) {
                return null;
            }
        };
    }
}
