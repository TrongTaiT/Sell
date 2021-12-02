/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.HoaDonNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonNhap_Dao {

    String INSERT_SQL = "INSERT INTO HoaDonNhap VALUES (?, ?, ?, ? ,?, ?, ?, ? )";
    String UPDATE_SQL = "UPDATE HoaDonNhap SET MaSanPham = ?, SoLuong = ?, GiaTien = ?,MaQuanLy=?, GhiChu=?,MaCuaHang= ? where MaNhapHang= ?";
    String DELETE_SQL = "DELETE FROM HoaDonNhap WHERE MaNhapHang = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDonNhap";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDonNhap WHERE MaNhapHang = ?";


    public void insert(HoaDonNhap entity) {
        try {
            JdbcHelper.executeUpdate(INSERT_SQL,
                    entity.getMaNhapHang(),
                    entity.getMaSanPham(),
                    entity.getSoLuong(),
                    entity.getGiaTien(),
                    entity.getMaquanly(),
                    entity.getNgayNhap(),
                    entity.getGhiChu(),
                    entity.getMaCuaHang()
            );
        } catch (Exception e) {
            System.out.println(e + "loi dong 45 hoa don dao");
        }
    }

    public void update(HoaDonNhap entity) {
        try {
            JdbcHelper.executeUpdate(UPDATE_SQL,
                    entity.getMaSanPham(),
                    entity.getSoLuong(),
                    entity.getGiaTien(),
                    entity.getMaquanly(),
                    entity.getGhiChu(),
                    entity.getMaCuaHang(),
                    entity.getMaNhapHang()
            );
        } catch (Exception e) {
            System.out.println(e + "loi dong 55 hoa don nhap vien dao");
        }
    }

    public void delete(String key) {
        try {
            JdbcHelper.executeUpdate(DELETE_SQL, key);
        } catch (Exception ex) {
            System.out.println(ex + " loi dong 64 nhan vien dao");
        }
    }

    public List<HoaDonNhap> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public HoaDonNhap selectById(String key) {
        List<HoaDonNhap> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<HoaDonNhap> selectBySql(String sql, Object... args) {
        List<HoaDonNhap> list = new ArrayList<>();
        try {
            ResultSet rs = null;

            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonNhap model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return list;

    }

    private HoaDonNhap readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonNhap model = new HoaDonNhap();
        
        model.setMaNhapHang(rs.getString(1));
        model.setMaSanPham(rs.getString(2));
        model.setSoLuong(rs.getInt(3));
        model.setGiaTien(rs.getFloat(4));
        model.setMaquanly(rs.getString(5));
        model.setNgayNhap(rs.getDate(6));
        model.setGhiChu(rs.getString(7));
        model.setMaCuaHang(rs.getString(8));

        return model;
    }

}
