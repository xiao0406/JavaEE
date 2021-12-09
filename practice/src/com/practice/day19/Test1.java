package com.practice.day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> puke = new ArrayList<>();
        String[] dian = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] hua = {"黑桃", "红桃", "方片", "梅花"};

        for (String i : dian) {
            for (String j : hua) {
                String box = i + j;
                puke.add(box);
            }
        }
        puke.add("小王");
        puke.add("大王");
        //打乱牌
        Collections.shuffle(puke);
        System.out.println(puke);
        System.out.println("发牌:");
        ArrayList<Object> one = new ArrayList<>();
        ArrayList<Object> two = new ArrayList<>();
        ArrayList<Object> three = new ArrayList<>();
        ArrayList<Object> four = new ArrayList<>();
        for (int i = 0; i < puke.size(); i++) {
            String box = puke.get(i);
            if(i % 4 ==1){
                one.add(box);
            }else if(i % 4 ==2){
                two.add(box);
            }else if(i % 4 ==3){
                three.add(box);
            }else {
                four.add(box);
            }
        }
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        System.out.println("three = " + three);
        System.out.println("four = " + four);

    }
}
