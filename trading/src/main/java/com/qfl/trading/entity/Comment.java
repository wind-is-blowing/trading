package com.qfl.trading.entity;

public class Comment {
    private int user_id;
    private int o_id;
    private int score;

    @Override
    public String toString() {
        return "Comment{" +
                "user_id=" + user_id +
                ", o_id=" + o_id +
                ", score=" + score +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
