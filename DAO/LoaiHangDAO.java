/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.LoaiHang;
import com.Sell.entity.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class LoaiHangDAO extends SellDAO<LoaiHang, String> {

    String INSERT_SQL = "INSERT INTO LOAIHANG(MaLoai, TenLoai, GhiChu)"
            + " VALUES (?,?,?)";
    String UPDATE_SQL = "UPDATE LOAIHANG SET TenLoai=?, GhiChu=?"
            + " WHERE MaLoai=?";
    String DELETE_SQL = "DELETE FROM LOAIHANG WHERE MaLoai=?";
    String SELECT_ALL_SQL = "SELECT * FROM LOAIHANG";
    String SELECT_BY_ID = "SELECT * FROM LOAIHANG WHERE MaLoai=?";

    @Override
    public void insert(LoaiHang entity) {
        JdbcHelper.executeUpdate(INSERT_SQL,
                entity.getMaLoai(),
                entity.getTenLoai(),
                entity.getGhiChu());
    }

    @Override
    public void update(LoaiHang entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,
                entity.getTenLoai(),
                entity.getGhiChu(),
                entity.getMaLoai());
    }

    @Override
    public void delete(String maLoai) {
        JdbcHelper.executeUpdate(DELETE_SQL, maLoai);
    }

    @Override
    public List<LoaiHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public LoaiHang selectById(String maLoai) {
        List<LoaiHang> list = selectBySql(SELECT_BY_ID, maLoai);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<LoaiHang> selectBySql(String sql, Object... args) {
        List<LoaiHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                LoaiHang entity = new LoaiHang();
                entity.setMaLoai(rs.getString("MaLoai"));
                entity.setTenLoai(rs.getString("TenLoai"));
                entity.setGhiChu(rs.getString("GhiChu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

 }
