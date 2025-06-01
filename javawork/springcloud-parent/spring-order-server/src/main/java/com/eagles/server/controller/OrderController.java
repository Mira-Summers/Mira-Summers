package com.eagles.server.controller;

import com.eagles.server.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/order")
    public String findOrderById(@PathVariable("orderId") Integer orderId){
        return null;
    }

}
