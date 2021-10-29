package springcloud.controller;


import com.lian.springcloud.pojo.Dept;
import com.lian.springcloud.service.DeptClientService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.web.bind.annotation.*;
import springcloud.mapper.DeptMapper;

import java.util.List;

/**
 * @author Lian
 */
@RestController
public class DeptController {

    @Autowired
    private DeptMapper service;


    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept queryById(@PathVariable("id")Long id){
        Dept dept = service.selectById(id);
        System.out.println(dept);
        if (dept==null){
            throw new RuntimeException("id==>"+ id+" not exist");
        }
        return dept;
    };


    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept()
                .setDeptid(id).setDeptname("id==>"+ id+" not exist")
                .setDbsource("DBSource==>not exist");
    }

}
