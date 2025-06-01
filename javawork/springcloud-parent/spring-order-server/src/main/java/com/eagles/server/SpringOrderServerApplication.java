package com.eagles.server;

import com.eagles.pojo.Order;
import com.eagles.pojo.User;
import com.eagles.server.mapper.OrderMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringOrderServerApplication {
    private RestTemplate restTemplate;
    private OrderMapper orderMapper;

    public static void main(String[] args) {
        SpringApplication.run(SpringOrderServerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public RestTemplate restTemplate(Integer orderId){
        Order order=orderMapper.findOrderById(orderId);
        restTemplate.getForObject("http://localhost:8086/user/"+order.getUserId(), User.class);
        return null;
    }

}
