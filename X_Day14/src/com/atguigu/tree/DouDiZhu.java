package com.atguigu.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
斗地主案例
准备牌 55
洗牌
发牌
看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> box = new ArrayList<>();
        String[] huase = {"♠", "♥", "♣", "♦"};
        String[] dianshu = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};
        for (String hua : huase) {
            for (String dian : dianshu) {
                String poke = hua + dian;
                box.add(poke);
            }
        }
        System.out.println(box);
        box.add("joker");
        box.add("JOKER");
        box.add("赖子");
        //打乱牌的操作
        Collections.shuffle(box);
        //发牌
        ArrayList<String> 周润发 = new ArrayList<>();
        ArrayList<String> 周星驰 = new ArrayList<>();
        ArrayList<String> 刘德华 = new ArrayList<>();
        ArrayList<String> 地主牌 = new ArrayList<>();
        //地主牌有四张,添加倒数四张
        地主牌.add(box.get(box.size() - 1));
        地主牌.add(box.get(box.size() - 2));
        地主牌.add(box.get(box.size() - 3));
        地主牌.add(box.get(box.size() - 4));
        for (int i = 0; i < box.size() - 4; i++) {
            String poke = box.get(i);
            if (i % 3 == 0) {
                周润发.add(poke);
            } else if (i % 3 == 1) {
                周星驰.add(poke);
            } else {
                刘德华.add(poke);
            }
        }
        ArrayList<Character> rule = new ArrayList<>();

        Collections.addAll(rule, '3', '4', '5', '6', '7', '8', '9', '1', 'J', 'Q', 'K', 'A', '2', 'o', 'O', '子');
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                char ch1 = o1.charAt(1);
//                char ch2 = o2.charAt(1);
//                int i1 = rule.indexOf(ch1);
//                int i2 = rule.indexOf(ch2);
                return rule.indexOf(o1.charAt(1)) - rule.indexOf(o2.charAt(1));
            }
        };
        Collections.sort(地主牌, com);
        Collections.sort(周星驰, com);
        Collections.sort(周润发, com);
        Collections.sort(刘德华, com);

        System.out.println("地主牌 = " + 地主牌);
        System.out.println("刘德华 = " + 刘德华);
        System.out.println("周星驰 = " + 周星驰);
        System.out.println("周润发 = " + 周润发);
    }
}
