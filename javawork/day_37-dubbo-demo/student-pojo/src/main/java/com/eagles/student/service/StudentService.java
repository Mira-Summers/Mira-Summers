package com.eagles.student.service;

import com.eagles.student.pojo.Student;

import java.util.HashMap;
import java.util.List;

public interface StudentService {
    List<Student> students(HashMap hashMap);
}
