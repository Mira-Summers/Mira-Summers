package com.eagles.pojo;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){

        System.out.println("所有动物都有吃的特性");
    }
}
