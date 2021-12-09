package com.atguigu.fordemo;

/*
求100以内的和
 */
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum= " + sum);
    }
}
