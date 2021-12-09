package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合
        Collection<String> con = new ArrayList<String>();
        System.out.println("con = " + con);
        //给集合添加元素
        con.add("hello");
        con.add("java");
        con.add("world");
        //生成迭代器
        Iterator<String> it = con.iterator();
        //判断是否有下一个元素
        while(it.hasNext()){
            //获取下一个元素
            String str =it.next();
            System.out.println("str = " + str);
        }
    }
}
