package com.eagles.goods;

/*
    订单类
 */
public class Order {

    private String orderId;

    private Goods goods;

    private User user;

    public Order(Goods goods, User user) {
        this.goods = goods;
        this.user = user;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Order() {
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", goods=" + goods +
                ", user=" + user +
                '}';
    }
}
