package com.practice.day05;


import java.util.Random;
//import java.util.Scanner;

/*
- 模拟大乐透号码：

  - 一组大乐透号码由10个1-99之间的数字组成
  - 打印大乐透号码信息
- 开发提示：

  - 使用数组保存录入或随机产生的号码
  - 如果使用键盘输入，需要用到java.util.Scanner
  - 如果使用随机产生，可以使用Math.random()或java.util.Random的nextInt(bounds)
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random ra = new Random();
        //Scanner scan = new Scanner(System.in);
        //System.out.println("请输入十个数:");
        for (int i = 0; i < 10; i++) {
            int num = ra.nextInt(99)+1;
            //int num = scan.nextInt();
            arr[i] = num;
        }
        System.out.print("您的大乐透号码为:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
