package com.practice.day17;
/*
替换某字符串中的某字符串。

- 键盘录入一个srcStr字符串，再录入一个delStr字符串。
- 删除该字srcStr符串中的所有delStr字符串。
- 并且统计delStr字符串在srcStr中出现的次数
 */
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入源字符串:");
        String src = sc.nextLine();
        System.out.println("请输入要删除的字符串:");
        String del = sc.nextLine();
        //result : src中删除del的字符并把剩下的字符返回给result
        String result = src.replace(del, "");
        int count = (src.length() - result.length())/del.length();
        System.out.println(del + "共出现了:"+count+"次");
        System.out.println("删除"+del+"后字符串"+result);
    }
}
