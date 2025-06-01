package com.eagles.goods;

import java.util.List;

public class User {

    private String username;


    private List<Account> accountList;//一个用户可以绑定多个账户

    public User(String username, List<Account> accountList) {
        this.username = username;
        this.accountList = accountList;
    }

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", accountList=" + accountList +
                '}';
    }
}
