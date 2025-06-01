package com.eagles.server.mapper;

import com.eagles.pojo.Order;
import com.eagles.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    @Select("select * from tb_user where id=#{userId}")
    User findUserById(Integer orderId);

}
