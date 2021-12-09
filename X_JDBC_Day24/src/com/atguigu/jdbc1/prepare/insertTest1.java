package com.atguigu.jdbc1.prepare;

import JDBCUtiles.Utiles;
import com.atguigu.jdbc1.JDBCTest2;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
public class insertTest1 {
    // 修改表操作
    @Test
    public void test1Update(){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
             conn = Utiles.getConnection();
            String sql = "update t_product set pname = ?,price= ? where  pid = ?";
             ps = conn.prepareStatement(sql);
            ps.setString(1,"小米11");
            ps.setInt(2,3999);
            ps.setInt(3,14);
            ps.execute();
            Utiles.closeResource(conn,ps);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Utiles.closeResource(conn,ps);
        }

    }
    @Test
    public void testInsert(){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
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
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("conn = " + conn);
            //增删改操作
            String sql = "insert into t_product(pname,price,num) values(?,?,?)";
            // PreparedStatement  相当于信使
            //增加操作
            ps = conn.prepareStatement(sql);
            ps.setString(1, "小米6");
            ps.setInt(2, 2699);
            ps.setInt(3, 300);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (ps != null)
                    ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

