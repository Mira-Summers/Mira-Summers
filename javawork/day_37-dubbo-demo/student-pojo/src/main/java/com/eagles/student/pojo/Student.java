package com.eagles.student.pojo;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable {
    private Integer sid;
    private String stuName;
    private Integer age;
    private String birthday;
    private String hobby;
    private String address;
    private String cid;
    private Clazz clazz;
}
