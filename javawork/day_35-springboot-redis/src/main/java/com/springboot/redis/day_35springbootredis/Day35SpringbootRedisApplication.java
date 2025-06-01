package com.springboot.redis.day_35springbootredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.redis.mapper")
public class Day35SpringbootRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day35SpringbootRedisApplication.class, args);
    }

}
