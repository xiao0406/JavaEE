package com.practice.day17;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = scan.nextLine();

        StringBuilder s = new StringBuilder(str);
        //reverse:反转字符串的方法
        str = s.reverse().toString();
        System.out.println("反转后:" + str);
        scan.close();

    }
}
