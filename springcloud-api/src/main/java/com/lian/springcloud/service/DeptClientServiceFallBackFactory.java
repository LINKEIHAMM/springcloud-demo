package com.lian.springcloud.service;

import com.lian.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Lian
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept().setDeptid(id).setDeptname("降级服务开启===>").setDbsource("请稍后再试");
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
