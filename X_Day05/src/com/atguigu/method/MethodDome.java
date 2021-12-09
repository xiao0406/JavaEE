package com.atguigu.method;

public class MethodDome {
    public static void main(String[] args) {
        int x = 111;
        int y = 222;
        int sum = sum(x ,y);
        System.out.println("sum = " + sum);
    }

    //定义方法
    public static int sum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
}
