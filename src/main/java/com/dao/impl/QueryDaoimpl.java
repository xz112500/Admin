package com.dao.impl;

import com.dao.QueryDao;
import com.util.DemoConn;
import com.util.DemoDate;
import com.util.Vip;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

@Service
public class QueryDaoimpl extends DemoConn implements QueryDao {
    java.util.Date date = new Date();
    public final String Date = DemoDate.NewDate(date);
    @Override
    public Vip Insert(Vip vip) {
        Connection conn = DemoConn.Conn();
        String SQL = "insert into users (username,password,date,qq,address,Remarks) values (?,?,?,?,?,?)";
        try {
            pstm = conn.prepareStatement(SQL);
            pstm.setString(1, vip.getUsername());
            pstm.setString(2, vip.getPassword());
            pstm.setString(3, Date);
            pstm.setString(4, vip.getQq());
            pstm.setString(5, vip.getAddress());
            pstm.setString(6, vip.getRemarks());
            int S=pstm.executeUpdate();
            if (S>0){
                close(pstm,res,conn);
                return vip;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
