package com.qfl.trading.entity;

import java.sql.Date;

public class Detail {
    private int user_id;
    private int new_user_id;
    private int sku_id;
    private int o_id;
    private Date date;
    private int area;
    private int num;
    private float price;
    private int cate;
    private float k1;
    private float k2;
    private float k3;
    private float k4;
    private float J1;
    private float J2;
    private float J3;
    private float J5;
    private float J6;
    private float J7;
    private float Y2;
    private float Y3;
    private float S1;
    private float S3;
    private int label;
    private int status;
    private String userName;
    private String areaName;
    private String cateName;
    private String payType;

    @Override
    public String toString() {
        return "Detail{" +
                "user_id=" + user_id +
                ", new_user_id=" + new_user_id +
                ", sku_id=" + sku_id +
                ", o_id=" + o_id +
                ", date=" + date +
                ", area=" + area +
                ", num=" + num +
                ", price=" + price +
                ", cate=" + cate +
                ", k1=" + k1 +
                ", k2=" + k2 +
                ", k3=" + k3 +
                ", k4=" + k4 +
                ", J1=" + J1 +
                ", J2=" + J2 +
                ", J3=" + J3 +
                ", J5=" + J5 +
                ", J6=" + J6 +
                ", J7=" + J7 +
                ", Y2=" + Y2 +
                ", Y3=" + Y3 +
                ", S1=" + S1 +
                ", S3=" + S3 +
                ", label=" + label +
                ", status=" + status +
                ", userName='" + userName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", cateName='" + cateName + '\'' +
                ", payType='" + payType + '\'' +
                '}';
    }

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

    public int getNew_user_id() {
        return new_user_id;
    }

    public void setNew_user_id(int new_user_id) {
        this.new_user_id = new_user_id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }

    public float getK1() {
        return k1;
    }

    public void setK1(float k1) {
        this.k1 = k1;
    }

    public float getK2() {
        return k2;
    }

    public void setK2(float k2) {
        this.k2 = k2;
    }

    public float getK3() {
        return k3;
    }

    public void setK3(float k3) {
        this.k3 = k3;
    }

    public float getK4() {
        return k4;
    }

    public void setK4(float k4) {
        this.k4 = k4;
    }

    public float getJ1() {
        return J1;
    }

    public void setJ1(float j1) {
        J1 = j1;
    }

    public float getJ2() {
        return J2;
    }

    public void setJ2(float j2) {
        J2 = j2;
    }

    public float getJ3() {
        return J3;
    }

    public void setJ3(float j3) {
        J3 = j3;
    }

    public float getJ5() {
        return J5;
    }

    public void setJ5(float j5) {
        J5 = j5;
    }

    public float getJ6() {
        return J6;
    }

    public void setJ6(float j6) {
        J6 = j6;
    }

    public float getJ7() {
        return J7;
    }

    public void setJ7(float j7) {
        J7 = j7;
    }

    public float getY2() {
        return Y2;
    }

    public void setY2(float y2) {
        Y2 = y2;
    }

    public float getY3() {
        return Y3;
    }

    public void setY3(float y3) {
        Y3 = y3;
    }

    public float getS1() {
        return S1;
    }

    public void setS1(float s1) {
        S1 = s1;
    }

    public float getS3() {
        return S3;
    }

    public void setS3(float s3) {
        S3 = s3;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
