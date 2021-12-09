package com.practice.day10;
/*
1、在com.atguigu.test15包中声明人Person、男人Man、女人Woman类
​	（1）在Person类中，包含
​		①public void eat()：打印吃饭
​		②public void toilet()：打印上洗手间
​	（2）在Man类中，包含
​		①重写上面的方法
​		②增加  public void smoke()：打印抽烟
​	（3）在Woman类中，包含
​		重写上面的方法
​		②增加 public void makeup()：打印化妆
​	2、在com.atguigu.test15包中声明测试类Test15
​	（1）public static void meeting(Person...  ps)
​		在该方法中，每一个人先吃饭，然后上洗手间，然后如果是男人，随后抽根烟，如果是女人，随后化个妆
​	public static void main(String[] args)
​	在主方法中，创建多个男人和女人对象，并调用meeting()方法进行测试
 */
public class Test15 {
}
class Person{
    public void eat(){
        System.out.println("吃饭");
    }
    public void toilet(){
        System.out.println("上洗手间");
    }
}
class Man extends Person{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void toilet() {
        super.toilet();
    }
    public void smoke(){
        System.out.println("抽烟");
    }
}
class WoMan extends Person{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void toilet() {
        super.toilet();
    }

    public void makeUp(){
        System.out.println("化妆");
    }
}