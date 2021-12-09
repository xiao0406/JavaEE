package com.atguigu.file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        getFileName(new File("X_Day16"));

    }
    public static void getFileName(File file){
        if(file.isFile()){
            return;
        }
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
            getFileName(f);
        }

    }
}
