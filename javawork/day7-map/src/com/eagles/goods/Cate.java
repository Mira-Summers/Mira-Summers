package com.eagles.goods;

public class Cate {

    private String cateId;

    private String cateName;

    public Cate(String cateId, String cateName) {
        this.cateId = cateId;
        this.cateName = cateName;
    }

    public Cate() {
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Override
    public String toString() {
        return "Cate{" +
                "cateId='" + cateId + '\'' +
                ", cateName='" + cateName + '\'' +
                '}';
    }
}
