package com.practice.day19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("按照成绩和年龄排序：");
        TreeSet<Student> stu = new TreeSet<>();
        stu.add(new Student("liusan",20,90.0));
        stu.add(new Student("lisi",22,90.0));
        stu.add(new Student("wangwu",20,99.0));
        stu.add(new Student("sunliu",22,100.0));
        for (Object obj : stu) {
            System.out.println("obj = " + obj);
        }
        System.out.println("按照姓名排序：");
        TreeSet<Student> all = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student student : stu) {
            all.add(student);
        }
        for (Student student : all) {
            System.out.println(student);
        }

    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.getScore()>o.getScore()){
            return -1;
        }else if(this.getScore()<o.getScore()){
            return 1;
        }
        return this.getAge()-o.getAge();
    }
}
