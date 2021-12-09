package com.atguigu.dillgui;
/*
不是神兔的递归方法
规律:
n = n-1 个月+ n-2个月
 */
public class DiGuiDemo1 {
    public static void main(String[] args) {
        int rabbit = getRabbit(20);
        System.out.println("rabbit = " + rabbit);
    }
    public static int getRabbit(int month){
        if(month == 1 || month==2){
            return 1;
        }
        return getRabbit(month -1)+getRabbit(month-2);
    }
}
