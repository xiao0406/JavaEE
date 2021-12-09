package com.atguigu.test;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一句话:");
        String line = sc.nextLine();
        //创建双链集合对象,键为录入的字母,值为录入字母的次数(个数)
        HashMap<Character, Integer> hm = new HashMap<>();
        //遍历字符串
        for (int i = 0; i < line.length(); i++) {
            //获取字符串中每个字符
            char ch = line.charAt(i);
            //判断hm中是否包含ch字符
            if(hm.containsKey(ch)){
                //包含,则输入老值
                Integer oldValue = hm.get(ch);
                //在hm双链集合里,就把值加一
                hm.put(ch,oldValue+1);
            }else{
                //不在hm里,则添加
                hm.put(ch,1);
            }
        }
        System.out.println("hm = " + hm);

    }
}
