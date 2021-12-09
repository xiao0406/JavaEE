package com.practice.day07;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scan.nextInt();
        System.out.println("请输入月份:");
        int month = scan.nextInt();
        System.out.println("请输入日期:");
        int day = scan.nextInt();

        MyDate m = new MyDate();
        m.setYear(year);
        m.setMonth(month);
        m.setDay(day);
        m.showDate();
        boolean flag = m.isLeapYear();
        System.out.println(m.getYear()+"年" + (flag ? "是瑞年" : "不是瑞年"));
    }
}
