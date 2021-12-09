package com.atguigu.tree;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int chinese;
    private int math;
    private int english;


    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    public int getScore(){
        return chinese + math + english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }


    @Override
    public int compareTo(Student o) {

        int result = o.getScore() - this.getScore();
        result = result == 0? o.chinese - this.chinese : result;
        result = result == 0? o.math - this.math : result;
        result = result  == 0? this.name.compareToIgnoreCase(o.name):result;
        return result;
    }
}
