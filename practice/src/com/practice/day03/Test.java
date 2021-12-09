package com.practice.day03;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 请输出a");
        double a = scan.nextDouble();
        System.out.println(" 请输出b");
        double b = scan.nextDouble();
        System.out.println(" 请输出c");
        double c = scan.nextDouble();
        if (a != 0) {
            if ((b * b - 4 * a * c) > 0) {
                double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
                double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
                System.out.println("x1="+x1+"x2 = " + x2);
            } else if (b * b - 4 * a * c == 0) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else  {
                System.out.println("无解");
            }
        }
        else if(a ==0 && b !=0){
        double x = -c / b;
            System.out.println("x = " + x);
         }else{
            System.out.println("不是方程");
        }
    }
}
