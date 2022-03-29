/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NguyenTruongChinh
 */
public class JdbcHelper {
    
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433; databaseName = SELL";
    static String user = "sa";
    static String password = "123";
    
    // Nạp driver
    static{
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static PreparedStatement prepareStatement(String sql, Object...args) throws SQLException{
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps;
        if(sql.trim().startsWith("{")){
            ps = con.prepareCall(sql);
        }
        else{
            ps = con.prepareStatement(sql);
        }
        for(int i = 0; i < args.length; i++){
            ps.setObject(i+1, args[i]);
        }
        return ps;
    }
    
    // CÁC THAO TÁC INSERT, UPDATE, DELETE
    
    public static int executeUpdate(String sql, Object...args){
        try {
            PreparedStatement ps = JdbcHelper.prepareStatement(sql, args);
            try {
                return ps.executeUpdate();
            } 
            finally{
                ps.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /* 
        * Thực hiện câu lệnh SQL truy vấn SELECT
        * Thực thi Pre đã truyền tham số ở trên
        * sql là câu lệnh SQL Statement có thể có đối số
        * args là list đối số của câu lệnh sql
    */
    
    public static ResultSet executeQuery(String sql, Object...args) throws SQLException{
        PreparedStatement ps = JdbcHelper.prepareStatement(sql, args);
        return ps.executeQuery();
    }
    
    public static Object value(String sql, Object...args){
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
