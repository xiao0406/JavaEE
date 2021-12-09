package com.practice.day07;

public class CountTest {
    public static void main(String[] args) {
        Count c = new Count();
        System.out.println("累加和"+c.sum(1,2,3,4));
        System.out.println("最大值"+c.max(2,3,45));
        System.out.println("字符串拼接"+c.concat("a","s","c"));
        System.out.println("是否偶数"+c.isEven(5));
    }
}
