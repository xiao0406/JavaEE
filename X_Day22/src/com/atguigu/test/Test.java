package com.atguigu.test;

public class Test {
    public static void main(String[] args) {
        Worker[] values = Worker.values();
        for (Worker value : values) {
            System.out.println(value.name()+"--"+value.ordinal()+"--"+value.getWorherDesc());
        }

    }
}
