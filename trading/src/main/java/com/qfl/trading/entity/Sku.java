package com.qfl.trading.entity;

public class Sku {
    private int sku_id;
    private int price;
    private int cate;

    @Override
    public String toString() {
        return "Sku{" +
                "sku_id=" + sku_id +
                ", price=" + price +
                ", cate=" + cate +
                '}';
    }

    public int getSku_id() {
        return sku_id;
    }

    public void setSku_id(int sku_id) {
        this.sku_id = sku_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }
}
