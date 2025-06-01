package com.eagles.bank;
//利息
public class SavingAccount extends Account{

    public SavingAccount() {

        super(); // new Account();
    }

    public SavingAccount(Balance balance) {
        super(balance);
    }

    public void save(){
        System.out.println("你的利息为"+getBalance().getMoney()*0.02);
    }
}
