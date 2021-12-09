package com.practice.day08;

public class TestC extends TestB {
    int numc = 30;

    @Override
    public void showA() {
        System.out.println("A类中showA:"+numa);
    }

    @Override
    public void showB() {
        System.out.println("B类中showB:"+numb);
    }
    public void showC(){
        System.out.println("C类中showC:"+numc);
    }
}
