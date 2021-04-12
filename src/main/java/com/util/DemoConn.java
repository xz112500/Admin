package com.util;

import java.sql.*;

public class DemoConn {
    public  PreparedStatement pstm=null;
    public  ResultSet res=null;
    public static Connection Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn= null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/User?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC","root","123456");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    public static void close(Statement stat, ResultSet rst, Connection conn)throws SQLException {
        if (stat!=null){
            stat.close();
        }
        if (conn!=null){
            conn.close();
        }
        if (rst!=null){
            rst.close();
        }
    }

}
