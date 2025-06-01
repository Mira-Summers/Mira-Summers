package project01;

import java.util.Scanner;

public class GoodAdvices {
    public void placeOrder(Goods goods,Consumer consumer){
        System.out.println("请输入购买数量:");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        Order order=new Order(goods,num,consumer.getAddress());


    }
    /*
    评价
     */

    public void assess(){

    }
}
