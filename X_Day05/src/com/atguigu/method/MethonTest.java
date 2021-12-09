package com.atguigu.method;

import java.util.Scanner;

/*
评委打分案例
    6个评委 去掉最高分 去掉最低分 / 4
    键盘录入
    数组
 */
public class MethonTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的分数");
            int score = scan.nextInt();
            arr[i] = score;
        }
        int sum = sum(arr);//总分
        int max = max(arr);//最大值
        int min = min(arr);//最小值
        // 平均数
        double mean =1.0 *(sum - max - min) / (arr.length - 2);
        System.out.println("平均数 = " + mean);
    }


    public static int sum(int[] arr){
        int sum = 0;//记录总分
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int max(int[] arr){
        int max = arr[0];//最大值
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min = 0;//最小值
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
