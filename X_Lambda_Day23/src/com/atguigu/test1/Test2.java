package com.atguigu.test1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/*
（1）声明学生类，包含姓名和年龄

（2）添加几个学生对象到一个ArrayList<Student>集合中

（3）对集合中的学生进行操作，找出年龄大于30岁的，并取出第一个学生，
        如果没有这样的学生，用无参构造new一个学生对象，打印学生信息
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2("鲁班",20));
        list.add(new Student2("鲁班大师",50));
        list.add(new Student2("后裔",31));
        list.forEach(System.out::println);
        System.out.println("-----------");

        Stream<Student2> student = list.stream().filter(a -> a.getAge() > 30);
        Optional<Student2> first = student.findFirst();
        System.out.println("first = " + first);

        Student2 newstudent = first.orElse(new Student2());
    }
}
