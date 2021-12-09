package com.practice.test;

/*
1.	判断101-200之间有多少个素数，并输出所有素数
 */
public class Test1 {
    public static void main(String[] args) {
        for (int a = 101; a <= 200; a++) {
            boolean flag = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("a = " + a);
            }
        }
    }
}
