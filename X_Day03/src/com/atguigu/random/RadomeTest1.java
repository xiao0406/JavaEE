package com.atguigu.random;

import java.util.Random;
import java.util.Scanner;

// 猜数字小游戏 (1-100)
public class RadomeTest1 {
    public static void main(String[] args) {
        //先生成一个随机数
        Random r = new Random();
        int number = r.nextInt(100)+1;
        //从键盘录入数字
        Scanner scan = new Scanner(System.in);
        while (true) {//死循环
            System.out.println("请输入一个1到100的数字");
            int getNumber = scan.nextInt();
            //判断输入的数字和生成的随机数是否相等
            if (getNumber < number) {
                System.out.println("你输入的数字" + getNumber + "太小了");
            } else if (getNumber > number) {
                System.out.println("你输入的数字" + getNumber + "太大了");
            } else {
                System.out.println("恭喜您,输入正确!" + "number=" + number);
                break;
            }
        }
    }
}
