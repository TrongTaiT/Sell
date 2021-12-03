/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.HinhAnh;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trongtai
 */
public class HinhAnhDao {

    String INSERT_SQL = "INSERT INTO HINHANH(MaSanPham, TenHinhAnh, HinhAnh)"
            + " VALUES (?,?,?)";
    // Lấy danh sách HinhAnh theo MaSanPham
    String SELECT_ALL_BY_ID_SQL = "SELECT * FROM HINHANH WHERE MaSanPham=?";
    // Xoá hình ảnh theo MaSanPham và dữ liệu byte[] hình ảnh
    String DELETE_SQL = "DELETE FROM HINHANH WHERE MaHinhAnh=?";

    public void insert(HinhAnh entity) {
        JdbcHelper.executeUpdate(INSERT_SQL,
                entity.getMaSanPham(),
                entity.getTenHinhAnh(),
                entity.getHinhAnh());
    }

    public List<HinhAnh> selectAllById(String maSanPham) {
        List<HinhAnh> list = selectBySql(SELECT_ALL_BY_ID_SQL, maSanPham);
        return list;
    }

    public void delete(HinhAnh ha) {
        JdbcHelper.executeUpdate(DELETE_SQL, ha.getMaHinhAnh());
    }

    protected List<HinhAnh> selectBySql(String sql, Object... args) {
        List<HinhAnh> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                HinhAnh entity = new HinhAnh();
                entity.setMaHinhAnh(rs.getInt("MaHinhAnh"));
                entity.setMaSanPham(rs.getString("MaSanPham"));
                entity.setTenHinhAnh(rs.getString("TenHinhAnh"));
                entity.setHinhAnh(rs.getBytes("HinhAnh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
