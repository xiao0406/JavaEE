package com.practice.test;
/*
8.	输入整型数98765，输出是56789
 */
public class Test8 {
    public static void main(String[] args) {
        int a = 98765;
        StringBuffer s = new StringBuffer("" + a);
        s.reverse();
        String s1 = s.toString();
        int i = Integer.parseInt(s1);
        System.out.println("i = " + i);
    }
}
