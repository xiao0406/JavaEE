package com.practice.day05;

import java.util.Random;

/*
随机验证码。

- 随机生成十组六位字符组成的验证码。
- 验证码由大小写字母、数字字符组成。


 */
public class Test9 {
    public static void main(String[] args) {
        int num;
        //创建数组 十组字符串
        String[] arr = new String[10];
        //生成随机数
        Random r = new Random();
        //遍历十遍,题目要求十组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";//字符串,拼接作用
            //for循环,验证码六位数
            for (int i1 = 0; i1 < 6; i1++) {
//先死循环,直到遍历出需要的数
                while (true) {
                    num = r.nextInt(122 - 48 + 1) + 48;//122:z  48:0
                    if (num >= 48 && num <= 57) {
                        break;
                    } else if (num >= 65 && num <= 90) {
                        break;
                    } else if (num >= 97 && num <= 122) {
                        break;
                    }
                }
                arr[i] += (char) num;  //结果是数字,给他转字符型
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("随机验证码:" + arr[i]);
        }
    }
}
