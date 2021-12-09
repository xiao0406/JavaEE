package com.practice.test;
/*
7.	有n步台阶，一次只能上1步或2步，共有多少种走法？
 */
public class Test7 {
    public static void main(String[] args) {
        int digui = digui(5);
        System.out.println("digui = " + digui);

    }
    public static int digui(int n){
        if(n<=2){
            return n;
        }
        return (digui(n-1)+digui(n-2));
    }
}
