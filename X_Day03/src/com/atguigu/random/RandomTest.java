package com.atguigu.random;

import java.util.Random;
import java.util.Scanner;

/*
    猜数字小游戏 (1-100)
    1. 生成随机数 1-100
    2. 猜? -> 键盘录入
    3. 比较 3种 if的第三种格式
    4. 不知道多少次猜对 --> 死循环
    5. 猜对了 要结束循环 break
 */
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100)+1;

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("请输入一个1到100的数字");
            int getNumber = scan.nextInt();

            if (getNumber > number) {
                System.out.println("您输入的数字" + getNumber + "大了");
            } else if (getNumber < number) {
                System.out.println("您输入的数字比" + getNumber + "小了");
            } else {
                System.out.println("恭喜您,猜中了!"+"number是" + number);
                break;
            }
        }
    }
}
