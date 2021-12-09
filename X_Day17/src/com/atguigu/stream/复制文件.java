package com.atguigu.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制文件 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("X_Day16/X_Day16.iml");
        FileOutputStream fos = new FileOutputStream("X_Day17/test1/2.txt");
        int by;
        while ((by = fis.read()) != -1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
