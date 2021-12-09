package com.practice.day19;

import java.util.ArrayList;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = getNum();
        System.out.println("10个随机值:"+ nums);

        ArrayList<Integer> maxList = getTop3(nums);
        System.out.println("前3个最大的：" + maxList);
        System.out.println("nums = " + nums);

    }


    public static ArrayList<Integer>getNum(){
            ArrayList<Integer> list = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                int n = r.nextInt(100)+1;
                list.add(n);
            }
            return list;
        }
        public static ArrayList<Integer> getTop3(ArrayList<Integer> list){
            ArrayList<Integer> maxList = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                Integer max =(Integer) list.get(0);
                for (int j = 0; j < maxList.size(); j++) {
                    Integer num = (Integer) list.get(j);
                    if(max < num){
                        max = num;

                    }
                }
                maxList.add(max);
                while (list.contains(max)){
                    list.remove(max);
                }
            }
            return maxList;

    }
}
