package com.practice.day05;
/*
- 统计字符

  - 字符数组：{'a','l','f','m','f','o','b','b','s','n'}
  - 统计每个字符出现的次数并打印到控制台。

- 代码实现，部分效果如图所示：

  ![](img\4.jpg)c

- 开发提示：

  - 将数字强制转换，根据ASCII码表转换为字符。
  - 可以定义长度26的数组，每个元素，对应去保存每种字符的出现次数，
  比如0索引保存a的次数，1索引保存b的次数，以此类推。
 */
public class Test3 {
    public static void main(String[] args) {
        char[] arr = {'a','l','f','m','f','o','b','b','s','n'};
        int[] counts = new int[26];//count数组的元素,目前默认值都是0
       /* count[0] 储存 'a' 字母出现的次数
            count[1] 储存'b'字母出现的次数
            ...
        */
        for (int i = 0; i < 10; i++) {
            counts[arr[i]-97]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] != 0){
                System.out.println((char)(i+97)+"--"+counts[i]);
            }
        }
    }
}
