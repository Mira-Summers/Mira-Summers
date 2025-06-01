package com.springboot.redis.mapper;

import com.springboot.redis.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select id,name,password form tb_user")
    List<User> getUsers();
}
