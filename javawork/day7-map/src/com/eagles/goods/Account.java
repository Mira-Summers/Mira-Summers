package com.eagles.goods;

public class Account {

    private double balance;

    private User user;

    private String bankName;

    public Account(double balance, User user) {
        this.balance = balance;
        this.user = user;
    }

    public Account(double balance, String bankName) {
        this.balance = balance;
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", user=" + user +
                '}';
    }
}
