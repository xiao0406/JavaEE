package com.atguigu.array;
/*
求和
 */
public class ArrayTest {
    public static void main(String[] args) {

        int sum = 0;
        int[] arr = {1,3,4,5,6,};
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            sum += num;
            System.out.println("arr[i] = " + arr[i]);
        }
        System.out.println("sum = " + sum);
    }
}
