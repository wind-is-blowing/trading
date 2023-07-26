package com.qfl.trading.entity;

public class OrderMap {
    String areaName;
    int count;

    @Override
    public String toString() {
        return "OrderMap{" +
                "areaName='" + areaName + '\'' +
                ", count=" + count +
                '}';
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
