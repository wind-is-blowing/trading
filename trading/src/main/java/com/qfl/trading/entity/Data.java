package com.qfl.trading.entity;
import java.sql.Date;

public class Data {
    private int user_id;
    private int sku_id;
    private float price;
    private Date date;
    private short cate;
    private short label;
    private String userName;
    private String areaName;
    private String cateName;
    private String payType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
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
                "user_id=" + user_id +
                ", sku_id=" + sku_id +
                ", price=" + price +
                ", date=" + date +
                ", cate=" + cate +
                ", label=" + label +
                ", userName='" + userName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", cateName='" + cateName + '\'' +
                ", payType='" + payType + '\'' +
                '}';
    }
}

