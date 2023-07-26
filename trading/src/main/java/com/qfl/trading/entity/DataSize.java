package com.qfl.trading.entity;

public class DataSize {
    private int actionSize;
    private int commentSize;
    private int orderSize;
    private int skuSize;

    @Override
    public String toString() {
        return "DataSize{" +
                "actionSize=" + actionSize +
                ", commentSize=" + commentSize +
                ", orderSize=" + orderSize +
                ", skuSize=" + skuSize +
                '}';
    }

    public int getActionSize() {
        return actionSize;
    }

    public void setActionSize(int actionSize) {
        this.actionSize = actionSize;
    }

    public int getCommentSize() {
        return commentSize;
    }

    public void setCommentSize(int commentSize) {
        this.commentSize = commentSize;
    }

    public int getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(int orderSize) {
        this.orderSize = orderSize;
    }

    public int getSkuSize() {
        return skuSize;
    }

    public void setSkuSize(int skuSize) {
        this.skuSize = skuSize;
    }
}
