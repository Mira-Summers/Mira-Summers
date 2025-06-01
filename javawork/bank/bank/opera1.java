package com.eagles.bank;

import java.util.Scanner;

public class opera1 {
    public static void main(String[] args) {

        //创建一个balance对象
        Balance balance = new Balance(0);

        SavingAccount savingAccount= new SavingAccount(balance);

        CherkAccount cherkAccount = new CherkAccount(balance);


        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("请选择操作：");
        System.out.println("1. 存钱");
        System.out.println("2. 取钱");
        System.out.println("3. 查利息");
        System.out.println("4. 查上限");
            System.out.println("5,退出");

        // 获取用户输入
        int options = scanner.nextInt();
        switch (options){
            case 1:
//                System.out.println("存钱");
                savingAccount.deposit();
                break;
            case 2:
//                System.out.println("取钱");
                savingAccount.withdraw();
                break;
            case 3:
//                System.out.println("查利息");
                savingAccount.save();
                break;
            case 4:
//                System.out.println("查上限");
                cherkAccount.cherk();
                break;
            case 5:
                System.out.println("退出");
                return; // 终止程序

        }



    }
}}
