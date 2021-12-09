package com.atguigu.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        //读文件
        BufferedReader br = new BufferedReader(new FileReader("X_Day18/test/学生.txt"));
        //创建一个集合
        ArrayList<Student> list = new ArrayList<>();
        //一次读一行
        String line;
        while ((line = br.readLine())!= null){
            String[] split = line.split(",");
            Student student = new Student(split[0], split[1], split[2], split[3]);
            list.add(student);
        }
        //年龄小于20岁的学生  打印信息
        for (Student student : list) {
            String age = student.getAge();
           if (Integer.parseInt(age) <= 20){
               System.out.println("student = " + student);
           }
        }
        br.close();
    }
}
