package com.atguigu.string;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = scan.nextLine();
        int smallCount = 0;
        int bigCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(i >= 'a' && i <= 'z'){
                smallCount++;
            }else if(i >= 'a' && i <= 'z'){
                bigCount++;
            }else if(i >= '0' && i <= '9'){
                numberCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("otherCount = " + otherCount);
        System.out.println("smallCount = " + smallCount);
        System.out.println("bigCount = " + bigCount);
        System.out.println("numberCount = " + numberCount);
    }
}
