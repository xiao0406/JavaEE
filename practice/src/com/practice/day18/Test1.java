package com.practice.day18;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("按照成绩和年龄排序:");
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("liusan", 20, 90.0));
        set.add(new Student("lisi", 22, 90.0));
        set.add(new Student("wangwu", 20, 99.0));
        set.add(new Student("sunliu", 22, 100.0));
        for (Student student : set) {
            System.out.println(student);
        }
        System.out.println("按照姓名排序:");
        TreeSet<Student> all = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        all.addAll(set);
        for (Student student : all) {
            System.out.println(student);
        }

    }
}

class Student implements Comparable<Student> {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getScore() > o.getScore()) {
            return -1;
        } else if (this.getScore() < o.getScore()) {
            return 1;
        }
        return this.getAge() - o.getAge();
    }
}