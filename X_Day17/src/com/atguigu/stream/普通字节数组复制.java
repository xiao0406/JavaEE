package com.atguigu.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 普通字节数组复制 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\OneDrive\\桌面\\单列集合的体系结构.png");
        FileOutputStream fos = new FileOutputStream("X_Day17/test1/单列集合的体系结构.png");
        int len;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys))!= -1){
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();
    }
}
