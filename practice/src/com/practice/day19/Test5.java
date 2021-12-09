package com.practice.day19;
/*
请定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数

​	2、创建集合，集合存放随机生成的30个小写字母

​	3、用listTest统计，某些元素的出现次数
 */
import java.util.ArrayList;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 30; i++) {
            list.add((char)(r.nextInt(26)+97)+"");
        }
        System.out.println(list);
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("x:"+listTest(list, "x"));

    }

    public static int listTest(ArrayList<String> list,String string){
        int count = 0;
        for (String object : list) {
            if(string.equals(object)){
                count++;
            }

        }
        return count;
    }
}
