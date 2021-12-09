package com.practice.day05;
/*
\- 比较两个数组内容是否完全一致。

- 开发提示：

  - 长度一致，内容一致，定义为完全一致。
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,3,2,1,2};
        int[] arr2 = {1,2,3,4,3,2,1};
        boolean flag = true;
        if(arr1.length != arr2.length){
            flag = false;
        }else{
            for (int i = 0; i < arr2.length; i++) {
                if(arr1[i] != arr2[i]){
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("是否一致: " + flag);
    }
}
