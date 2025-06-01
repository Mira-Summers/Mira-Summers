package project01;

public class Goods {

    public Goods(int goodsId) {
        this.goodsId = id++;
    }

    public int getGoodsId() {
        return goodsId;
    }

    private  int goodsId;
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    private String goodsName;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
    private static int id=10000;


}
