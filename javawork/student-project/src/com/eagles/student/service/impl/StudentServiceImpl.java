package com.eagles.student.service.impl;

import com.eagles.student.dao.StudentDao;
import com.eagles.student.dao.impl.StudentDaoImpl;
import com.eagles.student.pojo.Student;
import com.eagles.student.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    //聚合持久层的引用
    private StudentDao studentDao = new StudentDaoImpl();
    @Override
    public List<Student> getStudentList() {

        return studentDao.getStudentList();
    }
}
