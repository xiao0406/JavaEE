package com.atguigu.test2;

import java.lang.annotation.Annotation;

public class Son {
    public static void main(String[] args) {
        Class clazz = Son.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("annotation = " + annotation);
        }
    }
}
