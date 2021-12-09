package com.atguigu.method;

import java.util.Arrays;
import java.util.Scanner;

/*
冒泡排序
 */
public class MethonDome1 {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {14,43,23,43,45,65,67};
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1; j++) {

            for (int i = 0; i < arr.length - 1 - j; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
