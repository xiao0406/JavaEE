package com.atguigu.array;

public class ArrayDemo {
    public static void main(String[] args) {
        //动态数组
        int[] arr = new int[3];
        System.out.println("地址值:"+ arr);
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
        //修改元素
            arr[0] = 11;
            arr[1] = 22;
            arr[2] = 33;
            //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
        System.out.println("-------------------------------------");
          //静态数组
        String[] str = {"Java","python","php","js"};
        System.out.println("地址值:"+ str);
        //遍历数组
        for (String s : str) {
            System.out.println("str[i] = " + s);
        }
        //修改元素
        str[2] = "go";
        //遍历数组
        for (int i = 0; i < str.length; i++) {
            System.out.println("str[i] = " +str[i]);
        }
    }
}
