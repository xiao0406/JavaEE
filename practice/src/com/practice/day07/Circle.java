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
public class Circle {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void showArea(){
        System.out.println("圆的面积:"+Math.PI * r * r);
    }
    public void showPerimeter(){
        System.out.println("周长:"+Math.PI * r *2);
    }
}
