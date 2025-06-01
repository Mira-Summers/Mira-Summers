package com.eagles.bank;

import java.util.Scanner;

public class Account {
    public Account() {;
    }

    private Balance balance;

    //存款
    public void  deposit(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要存的金额：");
        double amount=scanner.nextDouble();

        double money = balance.getMoney();

        balance.setMoney(money + amount);

        System.out.println("存钱成功,你有"+balance.getMoney());
    }
    //取款
    public void withdraw(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要取的金额：");
        double amount=scanner.nextDouble();

        double money = balance.getMoney();

        balance.setMoney(money - amount);
        System.out.println("取钱成功,你有"+balance.getMoney());

    }


    public Account(Balance balance) {
        this.balance = balance;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }
}
