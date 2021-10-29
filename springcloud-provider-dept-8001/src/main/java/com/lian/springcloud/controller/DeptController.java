package com.lian.springcloud.controller;


import com.lian.springcloud.mapper.DeptMapper;
import com.lian.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lian
 */
@RestController
public class DeptController {

    @Autowired
    EurekaInstanceConfigBean eurekaInstanceConfigBean;

    @Autowired
    DeptMapper deptMapper;

    @Autowired
    org.springframework.cloud.client.discovery.DiscoveryClient discoveryClient;


    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptMapper.selectList(null);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        return deptMapper.selectById(id);
    }

    @PostMapping("/dept/add")
    public int add(@RequestBody Dept dept){
        return deptMapper.insert(dept);
    }

    @GetMapping("dept/discovery")
    public Object discoveryClient(){
        List<String> services = discoveryClient.getServices();
        System.out.println("discoveryClient==>" + services);

        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT-8001");

        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost());
            System.out.println(instance.getPort());
            System.out.println(instance.getUri());
            System.out.println(instance.getInstanceId());
        }

        return  discoveryClient;
    }
}
