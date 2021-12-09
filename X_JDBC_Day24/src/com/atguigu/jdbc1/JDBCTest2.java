package com.atguigu.jdbc1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        //读取配置信息
        /* .class : 加载类到内存中
            getClassLoader():获取类加载器的对象
            getResourceAsStream:快去的获取传入的文件路径指定的文件
         */
        InputStream is = JDBCTest2.class.getClassLoader().getResourceAsStream("com/atguigu/jdbc1/jdbc.properties");
        Properties pros = new Properties();// properties 是一个类
        pros.load(is);//读取文件中的键和元素 参考api
        // getproperty :用指定的键在属性列表中搜索属性(键找元素)
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");
        //加载驱动
        Class.forName(driverClass);
        //获取连接
        // DriverManager 是一个类
        //static Connection getConnection(String url, String user, String password)
        //          试图建立到给定数据库 URL 的连接。
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("conn = " + conn);

    }
}
