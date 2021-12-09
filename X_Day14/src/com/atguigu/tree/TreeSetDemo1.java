package com.atguigu.tree;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        ts.add("2");
        ts.add("4");
        ts.add("5");
        ts.add("1");
        ts.add("6");
        ts.add("9");
        ts.add("7");
        ts.add("10");
        System.out.println("ts = " + ts);
    }
}
