package com.atguilgu.oop;
public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("小米");
        p.setColor ("蓝色");
        p.setPrilce(5000);
        System.out.println(p.getBrand()+" "+
                p.getColor()+" "+p.getPrilce());

    }
}


