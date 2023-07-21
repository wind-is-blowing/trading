package com.qfl.trading.entity;
import java.sql.Date;

public class Data {
    private int u_id;
    private int sku_id;
    private float price;
    private Date date;
    private short cate;
    private short label;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getSku_id() {
        return sku_id;
    }

    public void setSku_id(int sku_id) {
        this.sku_id = sku_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public short getCate() {
        return cate;
    }

    public void setCate(short cate) {
        this.cate = cate;
    }

    public short getLabel() {
        return label;
    }

    public void setLabel(short label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Data{" +
                "u_id=" + u_id +
                ", sku_id=" + sku_id +
                ", price=" + price +
                ", date=" + date +
                ", cate=" + cate +
                ", label=" + label +
                '}';
    }
}

