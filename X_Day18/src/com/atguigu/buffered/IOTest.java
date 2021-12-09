package com.atguigu.buffered;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IOTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("X_Day18/test/出师表.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine())!= null){
            list.add(line);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] split1 = o1.split("\\.");
                String[] split2 = o2.split("\\.");
                String s1= split1[0];
                String s2= split2[0];
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                return i1 - i2;
            }
        });
        BufferedWriter bw = new BufferedWriter(new FileWriter("X_Day18/test/出师表.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();

    }
}
