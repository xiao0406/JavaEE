package com.practice.day18;

import java.util.Arrays;
import java.util.Comparator;

public class Test5 {
    public static void main(String[] args) {
        Integer[] arr = {2,7,4,5,9,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        String[] all = {"helli","Hello","chai","Chai"};
        sort(all, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(Arrays.toString(all));

        }

    public static<T extends Comparable<T>> void sort(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static <T> void sort(T[] arr, Comparator<? super T> c){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(c.compare(arr[j],arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
