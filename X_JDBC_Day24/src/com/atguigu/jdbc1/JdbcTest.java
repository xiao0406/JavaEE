package com.atguigu.jdbc1;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/db0624";
        String user = "root";
        String password = "123456";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("链接对象 = " + connection);
        Statement statement = connection.createStatement();
        String sql = "select * from classes";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.print(resultSet.getInt("cid"));
            System.out.print(resultSet.getString("cname"));
            System.out.println();
        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}
