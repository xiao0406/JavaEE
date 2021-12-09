package com.practice.day12;


/*
- 拟工人挑苹果。
- 定义苹果类：
  - 属性：大小，颜色。
  - 提供基本的构造方法和get方法，set方法
- 定义接口CompareAble：
  - 定义默认方法compare，挑选打印较大苹果。
- 定义工人类：
  - 成员方法：挑选苹果public void pickApple(CompareAble c,Apple a1,Apple a2)。
- 测试类：
  - 创建两个Worker对象。
  - 创建两个Apple对象，一个Apple（5，"青色"）,一个Apple（3，"红色"）
  - 调用工人对象的pickApple方法，分别用匿名内部类实现接口的方式实现挑选苹果，分别实现挑选大的和挑选红色的
 */
public class Test6 {
    public static void main(String[] args) {
        Work w = new Work();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");
        w.pickApple(new CompareAble() {
        }, a1, a2);
        w.pickApple(new CompareAble() {
            @Override
            public void compare(Apple a1, Apple a2) {
                System.out.println("挑红的：");
                if ("红色".equals(a1.getColour())) {
                    System.out.println(a1);
                }
                if ("红色".equals(a2.getColour())) {
                    System.out.println(a2);
                }
            }
        }, a1, a2);
    }
}

class Apple {
    private double size;
    String colour;

    public Apple() {
    }

    public Apple(double size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

interface CompareAble {
    public default void compare(Apple a1, Apple a2) {
        System.out.println("默认挑选大的");
        if (a1.getSize() > a2.getSize()) {
            System.out.println(a1);
        } else {
            System.out.println(a2);
        }

    }
}

class Work {
    public void pickApple(CompareAble c, Apple a1, Apple a2) {
        c.compare(a1, a2);
    }

}