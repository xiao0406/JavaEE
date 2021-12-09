package com.practice.day17;
/*
- 键盘录入一个大字符串，再录入一个小字符串。
- 统计小字符串在大字符串中出现的次数。
 */
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大字符串:");
        String big = sc.nextLine();

        System.out.println("请输入一个小字符串:");
        String small = sc.nextLine();

        int index;
        int count = 0;
        //big.indexOf(small)  判断的是指定的字符(big)中没有该字符(small),则返回-1
        while ((index = big.indexOf(small))!= -1){
            big = big.substring(index+small.length());
            count++;
        }

        System.out.println(small + "出现了"+ count + "次");
    }
}
