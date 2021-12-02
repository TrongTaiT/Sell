/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trongtai
 */
public class SanPhamDAO extends SellDAO<SanPham, String> {

    String INSERT_SQL = "INSERT INTO SANPHAM(MaSanPham, TenSP, NhaSX, GhiChu, MaLoai, GiaTien)"
            + " VALUES (?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SANPHAM SET TenSP=?, NhaSX=?, GhiChu=?, MaLoai = ?, GiaTien=?"
            + " WHERE MaSanPham=?";
    String DELETE_SQL = "DELETE FROM SANPHAM WHERE MaSanPham=?";
    String SELECT_ALL_SQL = "SELECT * FROM SANPHAM";
    String SELECT_BY_ID = "SELECT * FROM SANPHAM WHERE MaSanPham=?";
    String SELECT_BY_ID_NAME = "SELECT * FROM SANPHAM WHERE MaSanPham=? OR TenSP=?";

    @Override
    public void insert(SanPham entity) {
        JdbcHelper.executeUpdate(INSERT_SQL,
                entity.getMaSanPham(),
                entity.getTenSP(),
                entity.getNhaSX(),
                entity.getGhiChu(),
                entity.getMaLoai(),
                entity.getGiaTien());
    }

    @Override
    public void update(SanPham entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,
                entity.getTenSP(),
                entity.getNhaSX(),
                entity.getGhiChu(),
                entity.getMaLoai(),
                entity.getGiaTien(),
                entity.getMaSanPham());
    }

    @Override
    public void delete(String maSanPham) {
        JdbcHelper.executeUpdate(DELETE_SQL, maSanPham);
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham selectById(String maSanPham) {
        List<SanPham> list = selectBySql(SELECT_BY_ID, maSanPham);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSanPham(rs.getString("MaSanPham"));
                entity.setTenSP(rs.getString("TenSP"));
                entity.setNhaSX(rs.getString("NhaSX"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaLoai(rs.getString("MaLoai"));
                entity.setGiaTien(rs.getFloat("GiaTien"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<SanPham> selectByIDName(String keyword) {
        return this.selectBySql(SELECT_BY_ID_NAME, keyword);
    }

    public List<SanPham> selectByMaLoaiHang(String maLoaiHang) {

        String sql = "  select*from SanPham where MaLoai like ?";

        return this.selectBySql(sql, "%" + maLoaiHang + "%");

    }

}
