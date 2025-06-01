package com.eagles.master;

public class Test {

    public static void main(String[] args) {

        //创建主人类对象
        Master master = new Master();

        master.feed(new Cat());
        master.feed(new Dog());
        master.feed(new Rabbit());
        master.feed(new Snake());
        master.feed(new Bird());


    }

}
