package com.atguigu.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 字符流复制文件 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("X_Day17/test1/剑来1.txt");
        FileReader fr = new FileReader("D:\\小说\\剑来.txt");
        int len;
        char[] cha = new char[1024];
        while ((len = fr.read(cha))!= -1){
            fw.write(cha,0,len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
}
