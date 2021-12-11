/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.ChiTietCuaHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChiTietCuaHangDAO extends SellDAO<ChiTietCuaHang, String> {

    String INSERT_SQL = "INSERT INTO ChiTietCuaHang( MaCuaHang, MaSanPham, SoLuong) VALUES (?,?,?)";
    String UPDATE_SQL = "UPDATE ChiTietCuaHang SET   SoLuong =? WHERE MaCuaHang = ? and MaSanPham= ?";
    String DELETE_SQL = "delete from ChiTietCuaHang where MaCuaHang = ? and MaSanPham = ?";
    String SELECT_ALL_SQL = "select *from ChiTietCuaHang ";
    String SELECT_BY_ID_SQL = "select *from ChiTietCuaHang where MaCuaHang= ? ";

    @Override
    public void insert(ChiTietCuaHang entity) {

        JdbcHelper.executeUpdate(INSERT_SQL, entity.getMaCuaHang(), entity.getMaSanPham(), entity.getSoLuong());

    }

    @Override
    public void update(ChiTietCuaHang entity) {

        JdbcHelper.executeUpdate(UPDATE_SQL, entity.getSoLuong(), entity.getMaCuaHang(), entity.getMaSanPham());

    }

    public void delete(String key, String key2) {

        JdbcHelper.executeUpdate(DELETE_SQL, key, key2);

    }

    @Override
    public List<ChiTietCuaHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChiTietCuaHang selectById(String key) {
        List<ChiTietCuaHang> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<ChiTietCuaHang> selectAllByID(String maCH) {
        List<ChiTietCuaHang> list = this.selectBySql(SELECT_BY_ID_SQL, maCH);
        return list;
    }

    @Override
    protected List<ChiTietCuaHang> selectBySql(String sql, Object... args) {
        List<ChiTietCuaHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;

            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    ChiTietCuaHang model = readFromResultSet(rs);
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

    private ChiTietCuaHang readFromResultSet(ResultSet rs) throws SQLException {
        ChiTietCuaHang model = new ChiTietCuaHang();
        model.setMaCuaHang(rs.getString(1));
        model.setMaSanPham(rs.getString(2));
        model.setSoLuong(rs.getInt(3));

        return model;
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ChiTietCuaHang> selectByMaCuaHang(String mach,String masp) {

        String sql = "  select*from ChiTietCuaHang where MaCuaHang like ? and MaSanPham like ?";
        return this.selectBySql(sql, "%"+mach+"%","%"+masp+"%");
    }

}


