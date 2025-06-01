package com.eagles.goods;

public class Goods {

    private String goodsName;

    private String brandName;

    private String cateId;

    private Integer num;

    private Double price;

    private Cate cate;

    public Goods(String goodsName, String brandName, String cateId, Integer num, Double price, Cate cate) {
        this.goodsName = goodsName;
        this.brandName = brandName;
        this.cateId = cateId;
        this.num = num;
        this.price = price;
        this.cate = cate;
    }

    public Goods(String goodsName, String brandName, String cateId, Integer num, Double price) {
        this.goodsName = goodsName;
        this.brandName = brandName;
        this.cateId = cateId;
        this.num = num;
        this.price = price;
    }

    public Goods() {
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Cate getCate() {
        return cate;
    }

    public void setCate(Cate cate) {
        this.cate = cate;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsName='" + goodsName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", cateId='" + cateId + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", cate=" + cate +
                '}';
    }
}
