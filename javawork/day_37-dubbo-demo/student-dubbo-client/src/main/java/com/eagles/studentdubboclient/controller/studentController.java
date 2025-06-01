package com.eagles.studentdubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.eagles.student.pojo.Student;
import com.eagles.student.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class studentController {
    @Reference
    private StudentService studentService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Student> studentList(){
        return studentService.students(new HashMap());
    }

}
