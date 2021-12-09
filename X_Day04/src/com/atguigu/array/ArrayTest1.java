package com.atguigu.array;

/*
求最值
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {20, 34, 54, 77, 800, 1000, 600000};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
