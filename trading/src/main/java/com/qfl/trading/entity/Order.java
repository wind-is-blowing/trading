package com.qfl.trading.entity;

import java.sql.Date;

public class Order {
    private int user_id;
    private int sku_id;
    private int o_id;
    private Date date;
    private int area;
    private int num;
    private int label;

    @Override
    public String toString() {
        return "Order{" +
                "user_id=" + user_id +
                ", sku_id=" + sku_id +
                ", o_id=" + o_id +
                ", date=" + date +
                ", area=" + area +
                ", num=" + num +
                ", label=" + label +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSku_id() {
        return sku_id;
    }

    public void setSku_id(int sku_id) {
        this.sku_id = sku_id;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }
}
