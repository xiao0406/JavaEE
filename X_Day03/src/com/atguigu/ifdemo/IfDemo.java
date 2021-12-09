package com.atguigu.ifdemo;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("请输入您的成绩");
        int score = scan.nextInt();
        if(score <= 100 && score > 90){
            System.out.println("成绩优秀");
        }else if(score <= 90 && score > 70){
            System.out.println("成绩良好");
        }else if(score <=70 && score >=60){
            System.out.println("成绩及格");
        }else if(score < 60 && score >=0){
            System.out.println("成绩不及格");
        }else{
            System.out.println("输入错误");
        }
    }
}
