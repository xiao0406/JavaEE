package com.atguigu.extend;

public class ExtendsDemo {
    public static void main(String[] args) {


        class Person {
            String name;
            int age;
        }
        class Er extends Person {
            public void eat() {
                System.out.println("吃");
            }
        }
        class Teather {
            public void teath() {
                System.out.println("教");
            }
        }
    }
}