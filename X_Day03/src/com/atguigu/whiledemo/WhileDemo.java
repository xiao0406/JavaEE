package com.atguigu.whiledemo;


public class WhileDemo {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i <= 100){
            if(i % 2 == 1){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }

}
