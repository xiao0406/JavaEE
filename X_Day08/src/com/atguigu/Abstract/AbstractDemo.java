package com.atguigu.Abstract;

public class AbstractDemo {
}
abstract class Pet {
    String name;
    int age;

    public void show() {

    }

    public abstract void eat();

    public abstract void sleep();
}
class Rabbit extends Pet{

    @Override
    public void eat() {
        System.out.println("兔子吃草");
    }
    public void sleep(){
        System.out.println("兔子睡觉");
    }

}
