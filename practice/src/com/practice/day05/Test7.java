package com.practice.day05;
/*
- gen据标准答案【ADBCD】，每题2分共10分，求出每名学生最终得分。

  - 四名同学答案分别为：
    - 小尚：【DCBAD】
    - 小硅：【ADBCD】
    - 小谷：【ADBCA】
    - 小好：【ABCDD】
  - 每答对一题，得2分，输出四名同学的最终得分。

提示：标准答案放到一个一维数组中，每个同学答案也各自放到一个一维数组中，然后分别统计得分
 */
public class Test7 {
    public static void main(String[] args) {
        String[] arr ={"A","D","B","C","D"};
        String[] shang ={"D","C","B","A","D"};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(shang[i] == arr[i]){
                sum +=2;
            }
        }
        System.out.println("小上得分:"+sum);
    }
}
