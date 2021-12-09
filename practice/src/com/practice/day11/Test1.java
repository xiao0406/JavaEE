package com.practice.day11;
/*
1. 定义接口A，普通类B实现接口A
2. A接口中，定义抽象方法showA。
3. A接口中，定义默认方法showB。
4. B类中，重写showA方法
5. 测试类中，创建B类对象，调用showA方法，showB方法。
 */
public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();
    }
}
interface A {
    public void showA();
    //默认方法
    public default void showB(){
        System.out.println("showB默认方法");

    }
}
class B implements A{

    @Override
    public void showA() {
        System.out.println("showA");

    }
}
