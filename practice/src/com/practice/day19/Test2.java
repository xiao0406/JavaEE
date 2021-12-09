package com.practice.day19;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Integer> lotNumList = lotNum();
        System.out.println("乐透号码已经生成,游戏开始:");
        ArrayList<Integer> inputList = inputNum();
        System.out.println("您输入的号码为:" + inputList);
        int count = countNum(inputList, lotNumList);
        System.out.println("乐透号码为:" + lotNumList);
        System.out.println("猜中了:" + count + "个数字");
    }

        public static int countNum(ArrayList<Integer> inputList,ArrayList<Integer> lotNumList){
            int count = 0;
            for (int i = 0; i < inputList.size(); i++) {
                Object num = inputList.get(i);
                if(lotNumList.contains(num)){
                    count++;
                }
            }
            return count ;
        }


        public static ArrayList<Integer> inputNum(){
            ArrayList<Integer> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.println("请输入第"+(i+1)+"个数字[1-50]:");


                int num = sc.nextInt();
                if(num >= 1 && num <= 50 && !list.contains(num)){
                    list.add(num);
                    i++;
                }else{
                    System.out.println(num+"超过[1-50]范围或重复录入，数字无效，请重新输入");
                }
            }
            sc.close();
            return list;
        }
        public static ArrayList<Integer> lotNum(){
            ArrayList<Integer> list = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                int num = r.nextInt(50)+1;

                if(!list.contains(num)){
                    list.add(num);
                    i++;
                }
            }
           return list;
    }
}
