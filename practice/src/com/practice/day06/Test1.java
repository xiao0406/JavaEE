package com.practice.day06;
/*
声明员工类性Employee，包含属：姓名编号、、年龄、薪资，

​	声明Test01测试类，并在main方法中，创建2个员工对象，
    并为属性赋值，并打印两个员工的信息
 */

public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "张三";
        e1.age = 23;
        e1.money = 10000.0;

        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "张三";
        e2.age = 22;
        e2.money = 11000.0;
        System.out.println("员工1的编号:" + e1.id + ",姓名:" + e1.name + ",年龄:" + e1.age + ",薪资:" + e1.money);
        System.out.println("员工2的编号:" + e2.id + ",姓名:" + e2.name + ",年龄:" + e2.age + ",薪资:" + e2.money);

    }
}

class Employee {
    int id;
    String name;
    int age;
    double money;//代表薪资
}
