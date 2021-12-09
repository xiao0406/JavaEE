package com.practice.day08;

public class Test7 {
    public static void main(String[] args) {
        System.out.println(getT(1));

    }

    public static int getT(int a) {
        if (a == 10) {
            return 1;
        }
        //第八天: 第七天/2 -1
        //第九天:第八天 /2 -1;
        return (getT(a+1)+1)*2;
    }
}
