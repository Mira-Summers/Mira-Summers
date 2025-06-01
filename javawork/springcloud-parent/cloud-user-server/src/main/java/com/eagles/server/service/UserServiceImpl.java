package com.eagles.server.service;

import com.eagles.pojo.Order;
import com.eagles.pojo.User;
import com.eagles.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User FindUserById(Integer userId) {

        return userMapper.findUserById(userId);
    }
}
