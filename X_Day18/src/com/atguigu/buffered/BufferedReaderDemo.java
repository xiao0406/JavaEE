package com.atguigu.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建流对象 输入流 高效字符输入流
        BufferedReader br = new BufferedReader(new FileReader("X_Day18/test/学生.txt"));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println("line = " + line);
        }
        br.close();
    }
}
