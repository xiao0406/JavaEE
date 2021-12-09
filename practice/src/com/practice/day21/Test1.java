package com.practice.day21;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:/testIO");
        boolean f = file.mkdirs();
        File f1 = file.getAbsoluteFile();

        File file1 = new File("e:/testIO/1.txt");
        boolean newFile = file1.createNewFile();
        System.out.println("f1 = " + f1);
        System.out.println("newFile = " + newFile);

    }
}
