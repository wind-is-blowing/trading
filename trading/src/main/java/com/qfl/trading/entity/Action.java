package com.qfl.trading.entity;

import java.sql.Date;

public class Action {
    private int user_id;
    private int sku_id;
    private Date date;
    private int num;

    @Override
    public String toString() {
        return "order{" +
                "user_id=" + user_id +
                ", sku_id=" + sku_id +
                ", date=" + date +
                ", num=" + num +
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
