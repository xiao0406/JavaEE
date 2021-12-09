package com.atguigu.dillgui;
/*
递归   5的递归(加法)
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        int sum = sum(5);
        System.out.println(sum);
    }
    public static int sum(int num){
        if(num == 1){
            return 1;
        }
        int sum = num * sum (num - 1);
        return sum;
    }
}
