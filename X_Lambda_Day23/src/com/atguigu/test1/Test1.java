package com.atguigu.test1;

import java.util.ArrayList;


/*
     学校想从一批学生中，
        选出年龄大于等于18，参加过考试并且成绩大于80的人去参加比赛
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("妲己",17,30.0));
        list.add(new Student1("安其拉",19,60.0));
        list.add(new Student1("王昭君",18,90.0));
        list.forEach(System.out::println);
        System.out.println("-------------------------");
        list.stream().filter(a -> a.getAge() >=18 && a.getScore()>= 80.0).forEach(System.out::println);
    }
}
