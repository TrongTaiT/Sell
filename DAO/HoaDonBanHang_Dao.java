/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.Auth;
import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.HoaDonBanHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonBanHang_Dao {

    String INSERT_SQL = "INSERT INTO HoaDonBanHang VALUES (?, ?, ?, ? ,?, ?, ?, ?,? )";
    String UPDATE_SQL = "UPDATE HoaDonBanHang SET [MaKhachHang] = ?, [NgayBan] = ?, [NoiDung] = ?,"
            + "[TrangThai]=?, [MaNhanVien]=?,[MaCuaHang]= ?, [MaGiamGia]=? ,ThanhTien=? where MaHDBan= ?";
    String DELETE_SQL = "DELETE FROM HoaDonBanHang WHERE MaHDBan = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDonBanHang";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDonBanHang WHERE MaHDBan = ?";
    String SELECT_BY_MAKH = "SELECT * FROM HOADONBANHANG WHERE MAKHACHHANG = ?";
    String SELECT_BY_KEYWORD = "SELECT * FROM HOADONBANHANG WHERE MaHDBan LIKE ? OR"
            + " MaKhachHang LIKE ? AND MaCuaHang LIKE ?";

    public void insert(HoaDonBanHang entity) {
        try {
            JdbcHelper.executeUpdate(INSERT_SQL,
                    entity.getMaHDBan(),
                    entity.getMaKhachHang(),
                    entity.getNgayBan(),
                    entity.getNoiDung(),
                    entity.getTrangThai(),
                    entity.getMaNhanVien(),
                    entity.getMaCuaHang(),
                    entity.getMaGiamGia(),
                    entity.getThanhTien()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(HoaDonBanHang entity) {
        try {
            JdbcHelper.executeUpdate(UPDATE_SQL,
                    entity.getMaKhachHang(),
                    entity.getNgayBan(),
                    entity.getNoiDung(),
                    entity.getTrangThai(),
                    entity.getMaNhanVien(),
                    entity.getMaCuaHang(),
                    entity.getMaGiamGia(),
                    entity.getThanhTien(),
                    entity.getMaHDBan()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String key) {
        try {
            JdbcHelper.executeUpdate(DELETE_SQL, key);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<HoaDonBanHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public HoaDonBanHang selectByMaKH(String key) {
        List<HoaDonBanHang> list = this.selectBySql(SELECT_BY_MAKH, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public HoaDonBanHang selectById(String key) {
        List<HoaDonBanHang> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<HoaDonBanHang> selectBySql(String sql, Object... args) {
        List<HoaDonBanHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;

            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonBanHang model = readFromResultSet(rs);
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

    private HoaDonBanHang readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonBanHang model = new HoaDonBanHang();

        model.setMaHDBan(rs.getString(1));
        model.setMaKhachHang(rs.getString(2));
        model.setNgayBan(rs.getDate(3));
        model.setNoiDung(rs.getString(4));
        model.setTrangThai(rs.getBoolean(5));
        model.setMaNhanVien(rs.getString(6));
        model.setMaCuaHang(rs.getString(7));
        model.setMaGiamGia(rs.getString(8));
        model.setThanhTien(rs.getFloat(9));
        return model;
    }

    public List<HoaDonBanHang> selectByKeyWord(String keyword, String keyword1) {
        List<HoaDonBanHang> list = this.selectBySql(SELECT_BY_KEYWORD,
                "%" + keyword + "%", "%" + keyword + "%", "%" + keyword1 + "%");
        return list;
    }

}
