package com.lian.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lian.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.stream.BaseStream;

/**
 * @author Lian
 */
@Component
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {
//    void findDeptByID(Long id);
//    void getDeptList();
//    void addDept(Dept dept);
}
