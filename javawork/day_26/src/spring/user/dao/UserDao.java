package spring.user.dao;

import spring.pojo.User;

import java.util.List;

public interface UserDao {
    int insert(User user);

    int update(User user);

    int delete(User user);




}
