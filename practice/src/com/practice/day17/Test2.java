package com.practice.day17;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个QQ号(必须是5-12位数,0不能开头):");
        String qq = scan.next();

        System.out.println("这个qq号是否正确:");
        if(qq.matches("[1-9][0-9]{4,11}+")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
