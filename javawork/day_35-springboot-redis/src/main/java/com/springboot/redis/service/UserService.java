package com.springboot.redis.service;

import com.springboot.redis.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
}
