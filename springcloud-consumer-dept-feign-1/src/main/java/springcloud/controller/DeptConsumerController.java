package springcloud.controller;
import com.lian.springcloud.pojo.Dept;
import com.lian.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lian
 */

@RestController
public class DeptConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    DeptClientService deptClientService = null;

    ///dept/getall

//    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return deptClientService.queryById(id);
    }


    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept){
        return deptClientService.add(dept);
    }


    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        System.out.println(deptClientService.queryAll());
        return deptClientService.queryAll();
    }
}
