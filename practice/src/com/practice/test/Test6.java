package com.practice.test;
/*
6.	第一个人10，第2个比第1个人大2岁，
    以此类推，请用递归方式计算出第8个人多大？

 */
public class Test6{
    public static void main(String[] args) {
        int digui = digui(8);
        System.out.println("digui = " + digui);

    }
    public static int digui(int n){
        if(n == 1){
            return 10;
        }
        return digui(n - 1) + 2;
    }
}
