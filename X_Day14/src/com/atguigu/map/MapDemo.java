package com.atguigu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //添加操作
        map.put("段延庆","大理公主");
        map.put("少林方丈","叶二娘");
        map.put("尹志平","小龙女");
        System.out.println("map = " + map);
        //遍历操作 方式一   遍历键,最后输出键值
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "-----"+ value);
        }
        System.out.println("------------------");
//         遍历操作 方式二 召集所有的结婚证对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +"-----"+ value);
        }
    }
}
