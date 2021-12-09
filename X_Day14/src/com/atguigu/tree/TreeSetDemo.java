package com.atguigu.tree;

import java.util.TreeSet;

public class       TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("Tom",100,100,100));
        ts.add(new Student("Jerry",90,70,80));
        ts.add(new Student("Tont",100,60,70));
        ts.add(new Student("Lily",60,25,50));
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
