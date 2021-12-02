/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.HinhAnh;
import com.Sell.entity.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trongtai
 */
public class HinhAnhDao extends SellDAO<HinhAnh, String> {

    String INSERT_SQL = "INSERT INTO HINHANH(MaSanPham, TenHinhAnh, HinhAnh)"
            + " VALUES (?,?,?)";
    String UPDATE_SQL = "UPDATE HINHANH SET TenHinhAnh=?, HinhAnh=?"
            + " WHERE MaSanPham=?";
    String DELETE_SQL = "DELETE FROM HINHANH WHERE MaSanPham=?";
//    String SELECT_ALL_SQL = "SELECT * FROM HINHANH WHERE MaSanPham=?";
    String SELECT_BY_ID = "SELECT * FROM HINHANH WHERE MaSanPham=?";

    @Override
    public void insert(HinhAnh entity) {
        JdbcHelper.executeUpdate(INSERT_SQL,
                entity.getMaSanPham(),
                entity.getTenHinhAnh(),
                entity.getHinhAnh());
    }

    @Override
    public void update(HinhAnh entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,
                entity.getTenHinhAnh(),
                entity.getHinhAnh(),
                entity.getMaSanPham());
    }

    @Override
    public void delete(String maSanPham) {
        JdbcHelper.executeUpdate(DELETE_SQL, maSanPham);
    }

    @Override
    public List<HinhAnh> selectAll() {
//        return this.selectByID();
        return null;
    }

    @Override
    public HinhAnh selectById(String maSanPham) {
        List<HinhAnh> list = selectBySql(SELECT_BY_ID, maSanPham);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HinhAnh> selectBySql(String sql, Object... args) {
        List<HinhAnh> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                HinhAnh entity = new HinhAnh();
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
