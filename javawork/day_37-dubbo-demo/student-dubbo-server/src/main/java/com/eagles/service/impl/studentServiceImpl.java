package com.eagles.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.eagles.student.pojo.Student;
import com.eagles.student.service.StudentService;
import com.eagles.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
@Service
public class studentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> students(HashMap hashMap) {
        return studentMapper.students(hashMap);
    }
}
