package com.eagles.mapper;
import com.eagles.student.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> students(HashMap hashMap);
}
