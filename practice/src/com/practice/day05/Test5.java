package com.practice.day05;
/*
- 判断数组中的元素值是否对称.

- 开发提示：

  - 数组中元素首尾比较。

 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        boolean flag = true;
        for(int left = 0 ,end = arr.length -1;left < end ;left++,end--){
            if (arr[left] != arr[end]){
                flag = false;
                break;
            }
        }
        System.out.println(flag?"对称":"不对称");
    }
}
