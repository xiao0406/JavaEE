package com.atguigu.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<m> clazz = m.class;
        m m = clazz.newInstance();
        Field n = clazz.getDeclaredField("N");
        System.out.println("n.get(m) = " + n.get(m));


        System.out.println("--------------");

        Class<m1> clazz1 = m1.class;
        m1 m1 = clazz1.newInstance();
        Field m2 = clazz1.getDeclaredField("M");
        System.out.println(m2.get(m1));


    }
}
