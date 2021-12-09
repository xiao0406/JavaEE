package com.practice.day05;
/*
- 统计高于平均分的分数有多少个。
  - 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
  步骤：

  （1）先求总分

  （2）求平均分

  （3）遍历数组，统计比平均分高的个数
 */
public class Test4 {
    public static void main(String[] args) {
        int j =0;
        int sum = 0;//总分
        double mean = 0;//平均值
        int[] arr = {95,92,75,56,98,71,80,58,91,91};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        mean = sum /(double) arr.length ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > mean){
                j++;
            }
        }
        System.out.println("总分 = " + sum);
        System.out.println("mean = " + mean);
        System.out.println(j);
    }
}
