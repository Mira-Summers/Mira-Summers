package com.eagles.server.controller;

import com.eagles.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/{userId}")
    @ResponseBody
    public String findUserById(@PathVariable("userId") Integer userId){
        return null;
    }

}
