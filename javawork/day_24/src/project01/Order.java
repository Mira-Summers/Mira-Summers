package project01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Order {
    //orderId自己生成
    public Order( Goods goods, int num) {
        //获取当前系统的时间
        String format=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        Random random=new Random();
        //1000-9999的随机数
        Integer data= random.nextInt(9999)+1000;
        String orderId=format+data;

        this.goods = goods;
        this.num = num;
    }



    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private String orderId;
    private Goods goods;
    private int num;

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    private String receiveAddress;


}
