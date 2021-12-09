package com.practice.day07;

import java.util.EventListener;

/*
​	在Count类中，声明如下方法：

1、public long  sum(int...  nums)：求0~n个整数的累加和，如果没有传参，就返回0

2、public int max(int a, int... others)：求1~n个整数中的最大值

3、public String concat(String...  strings)：求0~n个字符串的拼接结果

4、public boolean isEven(int... nums)：判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false

​	声明一个Test01测试类，并在main方法中调用测试
 */
public class Count {

    public long sum(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;

    }

    public int max(int a, int... others) {
        int max = a;
        for (int i = 0; i < others.length; i++) {
            if (others[i] > max) {
                max = others[i];
            }
        }
        return max;
    }

    public String concat(String... strings) {
        String string = "";
        for (int i = 0; i < strings.length; i++) {
            string += strings[i];
        }
        return string;
    }

    //public boolean isEven(int... nums)：判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false
    public boolean isEven(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
