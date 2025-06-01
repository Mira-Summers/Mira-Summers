package com.eagles.goods;


import java.util.ArrayList;

public class GoodsTest {

    public static void main(String[] args) {

       // GoodsManager.addGoods();


        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(6000,"招商银行"));
        accounts.add(new Account(3000,"建设银行"));
        //创建一个用户对象
        User user = new User("jack", accounts);

         GoodsManager.shoppingGoods(user);

        //GoodsManager.printGoodsByPrice();
       // GoodsManager.deleteGoodsByName();
       // GoodsManager.findGoodsByCateAndPrice();
        GoodsManager.findShopGoods();



    }

}
