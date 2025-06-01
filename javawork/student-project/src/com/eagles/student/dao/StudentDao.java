package com.eagles.student.dao;

import com.eagles.student.pojo.Student;

import java.util.List;

public interface StudentDao {

    /**
     * 实现学生列表
     * @return
     */
    List<Student> getStudentList();

}
