package com.eagles.student.service;

import com.eagles.student.pojo.Student;

import java.util.List;

public interface StudentService {

    /**
     * 实现学生列表
     * @return
     */
    List<Student> getStudentList();

}
