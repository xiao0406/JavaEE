package com.atguigu.enumdemo;

public enum LightEnum {
    RED("红灯停"),
    GREEN("绿灯行"),
    YELLOW("黄灯等一等");

    private String lightDesc;

    LightEnum(String lightDesc) {
        this.lightDesc = lightDesc;
    }

    public String getLightDesc() {
        return lightDesc;
    }

}
