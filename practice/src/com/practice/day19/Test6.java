package com.practice.day19;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
：键盘录入一个字符串，去掉其中重复字符，
打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字母:");
        String str = sc.nextLine();
        System.out.println("str = " + str);
        //LinkedHashSet自动去重
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println("set = " + set);
        System.out.println("去重后:");
        //转成字符串的操作
        String result = "";
        for (Character object : set) {
            result  += object;
        }
        System.out.println(result);
    }
}
