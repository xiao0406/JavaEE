package com.practice.test;
/*
10.	斐波纳契数列（Fibonacci Sequence），又称黄金分割数列。
一列数的规则如下：1、1、2、3、5、8、13、21、34....求第n位数是多少？
在数学上，斐波纳契数列以如下被以递归的方法定义：
F0=0，F1=1，Fn=F(n-1)+F(n-2)（n>=2，n∈N*）在现代物理、准晶体结构、化学等领域，
    斐波纳契数列都有直接的应用

 */
public class Test9 {
    public static void main(String[] args) {
        int digui = digui(30);
        System.out.println("digui = " + digui);
    }
    public static int digui(int n){
        int a = 1;
        if(n > 2){
            a = digui(n-1)+digui(n-2);
        }
        return a;
    }
}
