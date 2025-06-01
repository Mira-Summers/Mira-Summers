package com.eagles.bank;

public class Balance {

    private double money;

    public Balance(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "money=" + money +
                '}';
    }
}
