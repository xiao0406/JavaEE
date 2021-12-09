package com.practice.day08;

public class Test10 {
    public static void main(String[] args) {
        Man m = new Man();
        m.pee();
        Woman w = new Woman();
        w.pee();

    }
}

abstract class Person {
    public abstract void pee();
}

class Woman extends Person {

    @Override
    public void pee() {
        System.out.println("坐着尿");
    }
}

class Man extends Person {
    @Override
    public void pee() {
        System.out.println("站着尿");
    }

}
