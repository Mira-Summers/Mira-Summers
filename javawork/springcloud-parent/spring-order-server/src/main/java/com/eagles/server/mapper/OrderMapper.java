package com.eagles.server.mapper;

import com.eagles.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface OrderMapper {
    @Select("select id,user_id,name,price,num from tb_order where id=#{orderId}")
    Order findOrderById(Integer orderId);

}
