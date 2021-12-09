package com.atguigu.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class ClassLoaderDemo {
    public static void main(String[] args) throws IOException {
        InputStream srs = ClassLoader.getSystemResourceAsStream("a.txt");
        Properties prop = new Properties();
        prop.load(srs);
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String value = prop.getProperty(key);
            System.out.println(key + "----"+ value);

        }
    }
}
