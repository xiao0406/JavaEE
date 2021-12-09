package com.practice.day19;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Test7 {
    public static void main(String[] args) {
        TreeSet<Integer> red = new TreeSet<>();
        Random r = new Random();
        for (int i = 0; red.size() < 6; i++) {
            red.add(r.nextInt(33)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(red);
        list.add(r.nextInt(16)+1);
        System.out.println("双色球所有号码:"+list);
        System.out.println("红色号码是:" +red);
        System.out.println("蓝色号码是:"+list.get(list.size()-1));


    }
}
