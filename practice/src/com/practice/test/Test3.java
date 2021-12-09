package com.practice.test;

/*
3.	用100元钱买100支笔，其中钢笔3元/支，圆珠笔2元/支，铅笔0.5元/支，
        问钢笔、圆珠笔和铅笔可以各买多少支？请写main方法打印需要买的数目。
 */
public class Test3 {
    public static void main(String[] args) {
        double money = 100;
        double pen = 3;
        double ballpen = 2;
        double pencil = 0.5;
        int count = 100;
        for (int p = 1; p <= money / pen; p++) {
            for (int b = 1; b <= money / ballpen; b++) {
                for (int c = 1; c <= money / pencil; c++) {
                    if (p + b + c == count && p * pen + b * ballpen + c * pencil == money) {
                        System.out.println("购买" + p + "支钢笔，" + b + "支圆珠笔，" + c + "支铅笔");

                    }
                }
            }
        }
    }
}
