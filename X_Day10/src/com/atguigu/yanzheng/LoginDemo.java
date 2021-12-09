package com.atguigu.yanzheng;

import java.util.Scanner;

public class LoginDemo {
    //模拟数据库
    static String usename;
    static String password;
    static {
        usename = "admin01";
        password = "123456";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //可以输入三次
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您的账号:");
            String uName = sc.nextLine();
            System.out.println("请输入您的密码:");
            String pwd = sc.nextLine();
            System.out.println("请输入您的验证码(Yd12)");
            String checkWord = sc.nextLine();
            //判断账号密码是否和数据库的一样
            if(usename.equals(uName) && password.equals(pwd) && "Yd12".equalsIgnoreCase(checkWord)){
                System.out.println("登陆成功");
                return;
            }else{
                if(i == 2){
                    System.out.println("您已经连续输出错三次,请联系管理员~");
                    return;
                }
                System.out.println("密码错误,您还有"+(2 - i)+"次机会");
            }
        }
    }
}

