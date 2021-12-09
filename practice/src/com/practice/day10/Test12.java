package com.practice.day10;

public class Test12 {
    public static void main(String[] args) {
        Father f = new Son();//向上转型
        System.out.println(f.x);
    }
}
class Father{
    int x = 10;
    public Father(){
        this.print();
        x = 20;
    }
    public void print(){
        System.out.println("Father.x = " + x);
    }
}
class Son extends Father {
    int x = 30;

    public Son() {
        this.print();
        x = 40;
    }

    public void print() {
        System.out.println("Son.x = " + x);
}
}