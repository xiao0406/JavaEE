package com.practice.day07;
/*

- 在com.atguigu.test02.bean包中定义一个圆形Circle类。

  - 属性：私有化
    - r：半径
  - 构造方法：
    - 无参构造方法
    - 满参构造方法
  - 成员方法：
    - get/set方法
    - showArea方法：打印圆形面积
    - showPerimeter方法：打印圆形周长

- 在com.atguigu.test02.test包中定义测试类TestCircle：创建Circle对象，并测试。

 */

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setR(3);
        c.showArea();
        c.showPerimeter();
    }
}
