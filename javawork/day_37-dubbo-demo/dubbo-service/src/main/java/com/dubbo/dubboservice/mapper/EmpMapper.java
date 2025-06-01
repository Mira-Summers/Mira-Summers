package com.dubbo.dubboservice.mapper;

import dubbo.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper//自动代理出代理对象
public interface EmpMapper {
    List<Emp> empList(HashMap hashMap);

}
