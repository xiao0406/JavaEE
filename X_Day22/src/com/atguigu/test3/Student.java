package com.atguigu.test3;

/*
1. 自定义注解，只能修饰方法，包含一个成员变量age，有默认值20
2. 定义Student类，包含验证年龄的方法，使用自定义注解修饰，在此方法中读取注解中的年龄信息并进行判断，如果年龄在18岁以下，提示“未成年”，否则，提示“已成年”
3. 定义测试类
 */
public class Student {
    @MyAnno1(age=21)
    public  void m() throws NoSuchMethodException {
        int age = Student.class.getDeclaredMethod("m").getAnnotation(MyAnno1.class).age();
        if(age <18){
            System.out.println("未成年");
           // System.out.println(age = 9);
        }else{
            System.out.println("已成年");
        }
        age=9;
        System.out.println("age = " + age);
        if(age <18){
            System.out.println("未成年");
            // System.out.println(age = 9);
        }else{
            System.out.println("已成年");
        }


    }

    public static void main(String[] args) throws NoSuchMethodException {
        Student student = new Student();
        student.m();
    }


}
