package com.atguigu.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = scan.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = scan.nextInt();
        //求最大值
        int temp = num1 > num2 ? num1 : num2;
        int result = temp > num3 ? temp : num3;
        System.out.println("最大值:"+ result);

    }
}
