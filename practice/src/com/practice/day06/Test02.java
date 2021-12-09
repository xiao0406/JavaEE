package com.practice.day06;
import com.practice.day03.*;
/*
案例：

​	声明一个日期类MyDate，包含属性：年、月、日

​	声明一个Test02测试类，并在main方法中，创建3个日期对象，一个是你的出生日期，
        一个是来尚硅谷的日期，一个是毕业的日期，并打印显示
 */
public class Test02 {
    public static void main(String[] args) {
        MyDate m1 = new MyDate();
        m1.year = 1999;
        m1.month = 6;
        m1.day = 24;

        MyDate m2 = new MyDate();
        m2.year = 2021;
        m2.month = 6;
        m2.day = 24;

        MyDate m3 = new MyDate();
        m3.year = 2021;
        m3.month = 12;
        m3.day = 24;
        System.out.println(m1.year + "." + m1.month + "." + m1.day);
        System.out.println(m2.year + "." + m2.month + "." + m2.day);
        System.out.println(m3.year + "." + m3.month + "." + m3.day);
    }
}
