package com.atguigu.buffered;

import java.io.*;

public class 高效字符流复制一次一行 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\小说\\剑来.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("X_Day18/test/剑来.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();

    }
}
