package com.practice.day11;

import javafx.concurrent.Worker;

/*
- 模拟工人挑苹果。
- 定义苹果类：
  - 属性：大小，颜色。
  - 提供基本的构造方法和get方法，set方法
- 定义接口CompareAble：
  - 定义默认方法compare，挑选打印较大苹果。
- 定义接口实现类CompareBig。
- 定义接口实现类CompareColor。挑选打印红色苹果。
- 定义工人类：
  - 成员方法：挑选苹果public void pickApple(CompareAble c,Apple a1,Apple a2)。
- 测试类：
  - 创建两个Worker对象。
  - 创建两个Apple对象，一个Apple（5，"青色"）,一个Apple（3，"红色"）
  - 调用工人对象的pickApple方法，分别用两种方式挑选苹果
 */
public class Test4 {
    public static void main(String[] args) {
        Work a = new Work();
        Apple a1 = new Apple (5, "青色");
        Apple a2 = new Apple(3, "红色");
        a.pickApple(new CompareBig(), a1, a2);
        a.pickApple(new CompareColor(), a1, a2);
    }
}

class Apple {
    private double size;
    private String color;

    public Apple() {
    }

    public Apple(double size, String color) {
        this.size = size;
        this.color = color;
    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

interface CompareAble {
    default void compare(Apple a1, Apple a2) {
        System.out.println("默认挑大的:");
        if (a1.getSize() > a2.getSize()) {
            System.out.println(a1);
        } else {
            System.out.println(a2);
        }
    }
}

class CompareBig implements CompareAble {

}

class CompareColor implements CompareAble {
    @Override
    public void compare(Apple a1, Apple a2) {
        System.out.println("红色苹果");
        if ("红色".equals(a1.getColor())) {
            System.out.println(a1);
        }
        if ("红色".equals(a2.getColor())) {
            System.out.println(a2);
        }
    }
}

// 定义工人类：
//  - 成员方法：挑选苹果public void pickApple(CompareAble c,Apple a1,Apple a2)。
class Work {
    public void pickApple(CompareAble c, Apple a1, Apple a2) {
        c.compare(a1, a2);
    }
}
