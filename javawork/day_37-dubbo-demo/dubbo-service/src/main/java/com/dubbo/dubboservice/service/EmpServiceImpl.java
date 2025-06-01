package com.dubbo.dubboservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.dubboservice.mapper.EmpMapper;
import dubbo.pojo.Emp;
import dubbo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> empList(HashMap hashMap) {

        return empMapper.empList(new HashMap<>());
    }
}
