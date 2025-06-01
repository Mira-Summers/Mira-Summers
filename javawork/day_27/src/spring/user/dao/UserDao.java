package spring.user.dao;

import spring.pojo.User;

public interface UserDao {
    int updateAdd(User user);
    int updateDelete(User user);


}
