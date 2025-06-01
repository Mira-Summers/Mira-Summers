package com.eagles.student.pojo;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clazz implements Serializable {
    private String className;
    private Integer cid;
}
