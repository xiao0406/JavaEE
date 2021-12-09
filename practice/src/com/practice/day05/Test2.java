package com.practice.day05;
/*
- 打印扑克牌.

- 开发提示：

  - 使用两个字符串数组，分别保存花色和点数
  - 再用一个字符串数组保存最后的扑克牌
  - 遍历显示
 */
public class Test2 {
    public static void main(String[] args) {
        String[] huase = {"黑桃","红桃","梅花","方片"};
        String[] dianshu = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] puke = new String[huase.length * dianshu.length];

        for (int i = 0,k = 0 ; i < huase.length; i++) {
            for (int j = 0; j < dianshu.length; j++,k++) {
                puke[k] = huase[i] + dianshu[j];
            }
        }
        for (int i = 1; i <= puke.length; i++) {
            System.out.print(puke[i - 1] + " ");
            if (i % 13 == 0) {
                System.out.println();
            }
        }
            System.out.println(puke[0]);
            System.out.println(puke[4]);
            System.out.println(puke[49]);
    }

}
