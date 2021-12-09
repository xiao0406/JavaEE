package com.atguigu.method;

import java.util.Scanner;

/*
用方法完成 键盘录入三个数 求3个数的较大值
 */
public class MethonDome2 {
    public static void main(String[] args) {
        //从键盘获取数据
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个值:");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个值:");
        int num2 = scan.nextInt();
        System.out.println("请输入第三个值:");
        int num3 = scan.nextInt();

        int max = max(num1, num2, num3);
        System.out.println("max = " + max);
    }

    public static int max(int a,int b ,int c){
        if(a > b ){
            if(a > c ){
                return a;
            }else{
                return c;
            }
        }else {//b < a
            if(b < c){
                return c;
        }else{
                return a;   //b > c
            }
        }
    }
}
