package com.practice.day05;

import java.util.Scanner;

/*
    案例：从键盘输入本组学员的人数，和本组学员的成绩，
    用数组存储成绩，然后实现从高到低排序
 */
public class Test8 {
    public static void main(String[] args) {
        int i1;
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入本组学员的人数");
        int score = scan.nextInt();

        int[] arr = new int[score];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入学员的成绩:" + (i + 1));
            arr[i] = scan.nextInt();
        }

        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "  ");

        }
    }
}

