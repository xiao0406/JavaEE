package com.practice.day11;
/*
1. 定义接口Universe，提供抽象方法doAnything。
2. 定义普通类Star，提供成员发光shine方法，打印“star:星星一闪一闪亮晶晶"
3. 定义普通类Sun，
   继承Star类，重写shine方法，打印"sun:光照八分钟，到达地球"
   实现Universe接口，实现doAnything，打印"sun:太阳吸引着9大行星旋转"
4. 测试类中，创建Star对象，调用shine方法
5. 测试类中，多态的方式创建Sun对象，调用doAnything方法，向下转型，调用shine方法。
 */
public class Test2 {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.doAnything();
        System.out.println("-----------------------");
        Universe u = new Sum();
        u.doAnything();
        Sum sum = (Sum) u;
        sum.shine();

    }
}
interface Universe {
    public void doAnything();
}
class Star{
    public void shine(){
        System.out.println("星星一闪一闪亮晶晶");
    }
}
class Sum extends Star implements Universe {
    @Override

    public void shine() {
        System.out.println("光照八分钟,到达地球");
    }

    @Override
    public void doAnything() {
        System.out.println("太阳吸引着9大行星旋转");
    }
}



