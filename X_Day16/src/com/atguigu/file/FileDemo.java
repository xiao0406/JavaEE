package com.atguigu.file;

        import java.io.File;
        import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("X_Day16/aaa/bbb/ccc");
        File file1 = new File(file, "wxy.java");
        file.mkdirs();
        file1.createNewFile();
    }
}
