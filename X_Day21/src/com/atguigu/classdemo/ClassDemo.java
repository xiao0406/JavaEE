package com.atguigu.classdemo;

public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Student stu1 = new Student();
        Class cs = stu1.getClass();
        System.out.println("cs = " + cs);

        Class sc = Student.class;
        System.out.println("sc = " + sc);

        Class aClass = Class.forName("com.atguigu.classdemo.Student");
        System.out.println("aClass = " + aClass);


    }
}
