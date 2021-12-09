package com.practice.day12;

/*
1、编写图形工具类：ShapTools
​	（1）声明方法1：public static void printRectangle()，打印5行5列*组成的矩形图形
​	（2）声明方法2：public static void printRectangle(int line, int column, String sign)，
           打印line行column列由sign组成的矩形图形
​	（3）给这个类加上文档注释：包含@author，@param等
​	（4）给方法1标记已过时注解
​	2、编写测试类Test04
​	在测试类中调用上面的两个方法测试，并在main方法上抑制警告
 */
public class Test4 {
    public static void main(String[] args) {
        ShapTools.printRectangle();
        ShapTools.printRectangle(3,8,"#");
    }
}
class  ShapTools {
    public static void printRectangle() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printRectangle(int line, int column, String sign) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("sign ");
            }
            System.out.println();
        }

    }
}