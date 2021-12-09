package com.atguigu.test;

import javax.naming.Name;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四", 19);
        Student stu3 = new Student("王五", 20);

        Student stu4 = new Student("赵六", 25);
        Student stu5 = new Student("田七", 26);
        Student stu6 = new Student("朱八", 27);

        ArrayList<Student> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();
        Collections.addAll(list1,stu1,stu2,stu3);
        Collections.addAll(list2,stu4,stu5,stu6);
        HashMap<String , ArrayList<Student>> school = new HashMap<>();
        school.put("一班",list1);
        school.put("二班",list2);
        //遍历
        Set<String> keys = school.keySet();
        for (String key : keys) {
            ArrayList<Student> clazz = school.get(key);
            for (Student student : clazz) {
                String name = student.getName();
                int age = student.getAge();
                System.out.println(key + "----" + name + "---" +age);
            }
        }
    }
}
