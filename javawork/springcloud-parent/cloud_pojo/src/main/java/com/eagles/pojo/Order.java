package com.eagles.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private Integer id;
    private Integer userId;
    private String name;
    private Double price;
    private Integer num;
    private User user;
}
