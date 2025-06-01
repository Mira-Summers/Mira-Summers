package com.springboot.redis.service;

import com.springboot.redis.mapper.UserMapper;
import com.springboot.redis.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
