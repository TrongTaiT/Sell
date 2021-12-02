
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.CuaHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class CuaHangDAO extends SellDAO<CuaHang, String> {

    String SQL_INSERT = "INSERT INTO CUAHANG(MaCuaHang, MaQuanLy, DiaChi, TrangThai)"
            + "VALUES (?,?,?,?)";
    String SQL_UPDATE = "UPDATE CUAHANG SET MaQuanLy = ?, DiaChi = ?, TrangThai = ? WHERE MaCuaHang = ?";
    String SQL_DELETE = "DELETE FROM CUAHANG WHERE MaCuaHang = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CUAHANG";
    String SELECT_BY_ID = "SELECT * FROM CUAHANG WHERE MaCuaHang = ?";
    String SELECT_BY_KEYWORD = "SELECT * FROM CUAHANG WHERE MaCuaHAng LIKE ?";

    @Override
    public void insert(CuaHang entity) {
        JdbcHelper.executeUpdate(SQL_INSERT,
                entity.getMaCH(),
                entity.getMaQuanLy(),
                entity.getDiaChi(),
                entity.getTrangThai());
    }

    @Override
    public void update(CuaHang entity) {
        JdbcHelper.executeUpdate(SQL_UPDATE,
                entity.getMaQuanLy(),
                entity.getDiaChi(),
                entity.getTrangThai(),
                entity.getMaCH());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.executeUpdate(SQL_DELETE, key);
    }

    @Override
    public List<CuaHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public CuaHang selectById(String key) {
        List<CuaHang> list = selectBySql(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<CuaHang> selectByKeyWord(String keyword) {
        return this.selectBySql(SELECT_BY_KEYWORD, "%" + keyword + "%");
    }

    @Override
    protected List<CuaHang> selectBySql(String sql, Object... args) {
        List<CuaHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                CuaHang entity = new CuaHang();
                entity.setMaCH(rs.getString("MaCuaHang"));
                entity.setMaQuanLy(rs.getString("MaQuanLy"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
