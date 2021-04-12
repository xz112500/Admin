package com.dao.impl;

import com.util.DemoConn;
import com.dao.query;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class queryimpl extends DemoConn implements query {
    @Override
    public boolean search(String username)throws SQLException {
        Connection conn= DemoConn.Conn();
        String SQL="select username from User.users";
        pstm=conn.prepareStatement(SQL);
        res=pstm.executeQuery();
        while (res.next()){
            String Username=res.getString("username");
            if (Username.equals(username)){
                return false;
            }
        }
        DemoConn.close(pstm,res,conn);
        return true;
    }
}
