package com.atguigu.random;

import java.util.Random;
import java.util.Scanner;

//猜数字小游戏 (1-100)
public class RandomTest2 {
    public static void main(String[] args) {
        //现在键盘上生成一个随机数
        Random r = new Random();
        int number = r.nextInt(100)+1;

        //键盘录入
        Scanner scan = new Scanner(System.in);
        while (true) {//死循环
            System.out.println("请输入一个一百以内的数字");
            int getNumber = scan.nextInt();//得到一个自己录入的数字
            //判断录入的数字是否和生成的数字一样(三种情况)
            if (getNumber > number) {
                System.out.println("您输入的数字" + getNumber + "太大了");
            } else if (getNumber < number) {
                System.out.println("您输入的数字" + getNumber + "太小了");
            } else {
                System.out.println("恭喜您,猜对了!" + "getNumber = " + getNumber);
                break;//猜对了,循环结束
            }
        }
    }
}
