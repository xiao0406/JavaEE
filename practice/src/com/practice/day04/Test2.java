package com.practice.day04;
/*

- 语法点：方法，运算符，for，while

- 编写步骤

1. 定义类 Test2，定义 main方法
2. main方法中,定义int类型变量 a为1
3. 使用while循环,判断a<=5,进入循环.
4. while循环内部,使用for循环,初始化int类型变量b为1,当b<=5时进入循环, 步进表达式b++
5. for循环内,不换行输出i并拼接" "
6. for循环外,输出换行.
7. for循环外,a自增.
 */
public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        while(a <= 5){
            for(int b = 0 ; b <= 5;b++){
                System.out.print(b+ " ");
            }
            System.out.println();
            a++;
        }

    }

}
