package com.eagles.pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer id;
    private String userName;
    private String address;
}
