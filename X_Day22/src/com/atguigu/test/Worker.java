package com.atguigu.test;

public enum  Worker {
    BUSy("忙碌"),
    FREE("自由"),
    VOCATION("职业"),
    DIMISSION("离职");
    private String worherDesc;

    Worker(String worherDesc) {
        this.worherDesc = worherDesc;
    }

    public String getWorherDesc() {
        return worherDesc;
    }
}
