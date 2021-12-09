package com.atguigu.test;

public class OperatorTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 40;
        int c = 103;

        int temp = a > b ? a : b ;
        int result = temp > c ? temp : c;
        System.out.println("resule = " + result);
    }
}
