package JDBCUtiles;

import com.atguigu.jdbc1.JDBCTest2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Utiles {
    /**
     * 获取链接的操作
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
        InputStream is =ClassLoader.getSystemClassLoader().getResourceAsStream("com/atguigu/jdbc1/jdbc.properties");
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
        return conn;
    }

    /**
     * 关闭资源的操作
     * @param conn
     * @param ps
     */
    public static void closeResource(Connection conn, PreparedStatement ps){
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
