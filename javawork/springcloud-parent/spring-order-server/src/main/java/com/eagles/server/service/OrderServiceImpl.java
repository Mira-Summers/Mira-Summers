package com.eagles.server.service;

import com.eagles.pojo.Order;
import com.eagles.pojo.User;
import com.eagles.server.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Order findOrderById(Integer orderId) {
        Order order=orderMapper.findOrderById(orderId);
        User user = restTemplate.getForObject("http://USERSERVER/user/" + order.getUserId(), User.class);
        return order;
    }
}
