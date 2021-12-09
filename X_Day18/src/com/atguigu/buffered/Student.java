package com.atguigu.buffered;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String age;
    private String assress;

    public Student() {
    }

    public Student(String id, String name, String age, String assress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.assress = assress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAssress() {
        return assress;
    }

    public void setAssress(String assress) {
        this.assress = assress;
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(assress, student.assress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, assress);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", assress='" + assress + '\'' +
                '}';
    }
}
