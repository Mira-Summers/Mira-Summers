package com.eagles.pojo;

public class User implements Comparable<User> {

    private Integer id;

    private String name;

    private int age;

    public User(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User user) {

        return user.getAge() - this.age;
    }
}
