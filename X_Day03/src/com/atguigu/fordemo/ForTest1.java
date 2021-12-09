package com.atguigu.fordemo;
/*
求回文数
回文数:12321  100001   12021等
 */
public class ForTest1 {
    public static void main(String[] args) {
        for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            if(ge == wan && shi == qian){
                System.out.println("回文数 = " + i);

            }
        }
    }
}
