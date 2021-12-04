/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list=new ArrayList<>();
            ResultSet rs=JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                Object[] vals= new Object[cols.length];
                for(int i=0;i<cols.length;i++){
                    vals[i]=rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
      public List<Object[]> getDoanhThu(String nam,String thang,String mach) {
        String sql="exec sp_tongdoanhthutheothangtatcasapxepgiamdan ?, ?, ?";
        String []cols={"MaCuaHang","TongTien"};
        return this.getListOfArray(sql, cols, nam,thang,mach);
    }
      public List<Object[]> getThongKeKhachHang(String nam,String thang,String makh) {
        String sql="exec sp_thongkekhachhangmuatheothanggiamdan ?, ?, ?";
        String []cols={"MaKhachHang","hoten","solanmua"};
        return this.getListOfArray(sql, cols, nam,thang,makh);
    }
      
}
