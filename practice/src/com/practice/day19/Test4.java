package com.practice.day19;

import java.util.ArrayList;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> ranNum = getRanNum();
        System.out.println("随机数为:");
        System.out.println(ranNum);
        System.out.println("其中的质数为:");
        ArrayList<Integer> pNum = getRanNum();
        System.out.println("pNum = " + pNum);

    }
    public static ArrayList<Integer> getPNum(ArrayList<Integer> ranNum){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ranNum.size(); i++) {
            Integer integer = (Integer) ranNum.get(i);
            if(isP(integer)){
                list.add(integer);
            }
        }
        return list;
    }
    public static ArrayList<Integer> getRanNum(){
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(r.nextInt(99)+2);
        }
        return list;
    }
    public static boolean isP(int n){
        boolean isPrime = true;
        for(int i = 2; i < n ; i++){
            if(n % i ==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
