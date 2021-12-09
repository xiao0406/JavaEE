package com.atguigu.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,Integer>> school = new HashMap<>();
        HashMap<String, Integer> clazz1 = new HashMap<>();
        clazz1.put("张三",18);
        clazz1.put("李四",19);
        clazz1.put("王五",20);
        HashMap<String,Integer> clazz2 = new HashMap<>();
        clazz2.put("赵六",28);
        clazz2.put("田七",29);
        clazz2.put("朱八",30);

        school.put("小班",clazz1);
        school.put("大班",clazz2);
//   找到外层的键
        Set<String> keys = school.keySet();
        //遍历外层键找到外层的值(内层的键值)
        for (String key : keys) {
            HashMap<String, Integer> clazz = school.get(key);
            Set<Map.Entry<String, Integer>> entries = clazz.entrySet();
            //遍历内层 得到键值
            for (Map.Entry<String, Integer> entry : entries) {
                String name = entry.getKey();
                Integer age = entry.getValue();
                System.out.println(key + "---"+ name + "---"+ age);
            }
        }
    }
}
