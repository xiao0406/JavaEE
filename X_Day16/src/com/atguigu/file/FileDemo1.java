package com.atguigu.file;

import java.io.File;
import java.io.FileFilter;

public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("X_Day16");
        File[] files = file.listFiles();
        System.out.println("files = " + files);
        for (File f : files) {
            System.out.println("f = " + f);
        }
        System.out.println("_----------------------");
        File[] files1 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".iml");
            }
        });
        for (File f1 : files1) {
            System.out.println("f1 = " + f1);
        }
    }
}
