package com.practice.day18;

public class Test3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5,};
        method(arr,0,1);
        for (Integer integer : arr) {
            System.out.println("integer = " + integer);
        }
    }
    public static <T> void method(T[]arr,int a,int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

