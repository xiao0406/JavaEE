package com.practice.day03;

import java.util.Scanner;

/*
案例：已知2019年1月1日是星期二，从键盘输入2019年的任意一天，请判断它是星期几
- 开发提示：
1. 先统计这一天是这一年的第几天days
2. 然后声明一个变量week，初始化为2
3. 然后week加上days-1
4. 然后求week与7的模数
5. 然后输出结果，考虑星期天的特殊判断
 */
public class Test3 {
    public static void main(String[] args) {
        int week = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = scan.nextInt();
        System.out.println("请输入一个日期");
        int day = scan.nextInt();
        switch (month) {
            case 1:
                week += day-1;
                break;
            case 2:
                week += day + 28-1;
                break;
            case 3:
                week += day + 31 + 28-1;
                break;
            case 4:
                week += day + 31 + 30 + 28-1;
                break;
            case 5:
                week += day + 31 * 2 + 30 + 28-1;
                break;
            case 6:
                week += day + 31 * 2 + 30 * 2 + 28-1;
                break;
            case 7:
                week += day + 31 * 3 + 30 * 2 + 28-1;
                break;
            case 8:
                week += day + 31 * 4 + 30 * 2 + 28-1;
                break;
            case 9:
                week += day + 31 * 4 + 30 * 3 + 28-1;
                break;
            case 10:
                week += day + 31 * 5 + 30 * 3 + 28-1;
                break;
            case 11:
                week += day + 31 * 5 + 30 * 4 + 28-1;
                break;
            case 12:
                week += day + 31 * 6 + 30 * 4 + 28-1;
        }

        switch (week % 7) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周2");
                break;
            case 3:
                System.out.println("周3");
                break;
            case 4:
                System.out.println("周4");
                break;
            case 5:
                System.out.println("周5");
                break;
            case 6:
                System.out.println("周6");
                break;
            case 0:
                System.out.println("周日");
                break;
        }
    }
}
