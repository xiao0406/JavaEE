package com.practice.day04;

import java.util.Scanner;

/*
从键盘分别输入年、月、日，使用循环for+if实现，判断这一天是当年的第几天
 注：判断一年是否是闰年的标准：

​       1）可以被4整除，但不可被100整除

​       2）可以被400整除

- 开发提示：
  1. 循环1-month月
  2. 在循环中判断该月是31天、30天、28/29天，分别累加
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年");
        int year = scan.nextInt();
        System.out.println("请输入月");
        int month = scan.nextInt();
        System.out.println("请输入日");
        int day = scan.nextInt();
        int days = day;
        for(int i = 1; i < month;i++){
            if(i == 4 || i== 6 ||i ==9 || i == 11 ){
                days += 30;
            }else if (i == 2){
                if(year % 4 == 0 && year % 100 != 0 && year % 400 ==0){
                    days += 29;
                }else {
                    days += 28;
                }
            }else{
                days += 31;

            }
        }
        System.out.println(year+"年"+month+"日"+day+"天是这一年的第"+days+"天");
    }
}
