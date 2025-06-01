package project01;

import java.util.Scanner;

public class A {
    //传入的是需要调用的对象
    public String pay(Consumer consumer,Order order){
        System.out.println("商品名称："+order.getGoods().getGoodsName()+"产品编号为："+order.getGoods().getGoodsId());
        System.out.println("");
        if(order.getGoods().getPrice()*order.getNum()>consumer.getAccountBalance()){
            return "余额不足";
        } else{
                consumer.setAccountBalance( consumer.getAccountBalance()-order.getGoods().getPrice()*order.getNum());
                return "购买成功"+"余额为："+consumer.getAccountBalance();
            }

    }
}
