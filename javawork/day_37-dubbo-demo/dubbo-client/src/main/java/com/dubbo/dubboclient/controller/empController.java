package com.dubbo.dubboclient.controller;

import dubbo.pojo.Emp;
import dubbo.service.EmpService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/dubbo")
public class empController {
    @Reference
    private EmpService empService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Emp> empList(){
        return empService.empList(new HashMap<>());
    }

}
