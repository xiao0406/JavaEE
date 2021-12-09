package com.atguigu.jdbc1.prepare;

import JDBCUtiles.Utiles;
import org.junit.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class UpTest2 {
    // 测试
    @Test
    public void testUpdate(){
        String sql = "delete from t_product where pname = ?";
        Update(sql,"方便面");
    }
    // 通用的增删改操作
    @Test
    public void Update(String sql,Object ... args){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Utiles.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1,args[i]);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Utiles.closeResource(conn,ps);
        }

    }
}
