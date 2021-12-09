package com.atguigu.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("X_Day17/test",true);
        fos.write("HelloWorld".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("太棒了".getBytes());
        fos.write("\r\n".getBytes());

        fos.close();

    }
}
