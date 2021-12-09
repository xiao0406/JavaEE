package com.practice.day12;
/*
编写一个匿名内部类，它继承Object，并在匿名内部类中，
    声明一个方法public void test()打印尚硅谷。
请编写代码调用这个方法。
 */
public class Test5 {
    public static void main(String[] args) {
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();
    }
}
