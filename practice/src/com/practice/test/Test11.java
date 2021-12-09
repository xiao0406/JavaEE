package com.practice.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/*
12.	消除下面集合中重复元素？
List list = Arrays.asList(1,2,3,3,4,4,5,5,6,1,9,3,25,4);
 */
public class Test11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5,5,6,1,9,3,25,4);
        //HashSet   去重
//        HashSet<Integer> hashSet = new HashSet<Integer>();
//        hashSet.addAll(list);
        //TreeSet  排序和去重
        TreeSet<Object> objects = new TreeSet<>(list);
        for (Object object : objects) {
            System.out.println("object = " + object);
        }
    }

}
