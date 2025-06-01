package com.eagles.bank;
//金额限制
public class CherkAccount extends Account{



    public CherkAccount() {

        super(); // new Account();

    }

    public CherkAccount(Balance balance) {
        super(balance);
    }

    public void cherk(){
        System.out.println("你的利息为"+getBalance().getMoney()*0.02);
    }
}
