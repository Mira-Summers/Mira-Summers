package com.springboot.redis.controller;

import com.springboot.redis.pojo.User;
import com.springboot.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/user")
    @ResponseBody
    public List<User> getUsers() {
        List<User> userList = null;
        if (redisTemplate.boundListOps("userlist").size() > 0) {
            System.out.println("从Redis中获取数据");
            userList = (List<User>) redisTemplate.boundListOps("userlist").range(0, -1);
        } else {
            System.out.println("--从mysql中获取数据--");
            userList = userService.getUsers();
            for (User user : userList) {
                redisTemplate.boundListOps("userlist").rightPush(user);
            }
        }
        return userList;
    }
}
