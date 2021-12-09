package com.atguigu.enumdemo;

public class Test {
    public static void main(String[] args) {
        LightEnum[] values = LightEnum.values();
        for (LightEnum value : values) {
            System.out.println("value = " + value);
            String lightDesc = value.getLightDesc();
            System.out.println(value+"--"+value.name()+"--"+value.ordinal()+"--"+value.getLightDesc());
        }
    }
}
