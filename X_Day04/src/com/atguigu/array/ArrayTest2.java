package com.atguigu.array;

import java.util.Scanner;

/*
j键盘输入一个数 ,查找索引值
 */
public class ArrayTest2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5,4,3,2,1};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个值");
        int num = scan.nextInt();

        int index = -1;
        for (int i =1; i < arr.length; i ++) {
            if(num == arr[i]){
                index = i;
                break;
            }
        }
      if(index == -1){
          System.out.println(" 您输入的值不在数组里");
      }else{
          System.out.println(" 您输入的" +num +"在第"+index+"索引位置出现" );
      }
    }
}
