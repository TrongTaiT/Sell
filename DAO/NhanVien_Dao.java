/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class NhanVien_Dao  {

    String INSERT_SQL = "INSERT INTO NhanVien ([MaNhanVien],[HoTen],[GioiTinh],[NgaySinh],[DienThoai],[Luong],[Email],[VaiTro],[MatKhau],[DiaChi],[MaCuaHang])"
            + " VALUES (?, ?, ?, ? ,?, ?, ? ,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET HoTen = ?, GioiTinh = ?, NgaySinh = ?,DienThoai=?, Luong=?,Email= ?, vaitro =?,Diachi = ?,MaCuaHang = ? WHERE MaNhanVien = ?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNhanVien = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNhanVien = ?";
    String SELECT_BY_KEYWORD = "SELECT * FROM NHANVIEN WHERE HoTen LIKE ?";

    public void insert(NhanVien entity) {
        try {
            JdbcHelper.executeUpdate(INSERT_SQL,
                    entity.getMaNV(),
                    entity.getHoTen(),
                    entity.getGioiTinh(),
                    entity.getNgaySinh(),
                    entity.getDienThoai(),
                    entity.getLuong(),
                    entity.getEmail(),
                    entity.getVaiTro(),
                    entity.getMatKhau(),
                    entity.getDiaChi(),
                    entity.getMaCuaHang()
            );
        } catch (Exception e) {
            System.out.println(e + "loi dong 37 nhan vien dao");
        }
    }

    public void update(NhanVien entity) {
        try {
            JdbcHelper.executeUpdate(UPDATE_SQL,
                    entity.getHoTen(),
                    entity.getGioiTinh(),
                    entity.getNgaySinh(),
                    entity.getDienThoai(),
                    entity.getLuong(),
                    entity.getEmail(),
                    entity.getVaiTro(),
                    entity.getDiaChi(),
                    entity.getMaCuaHang(),
                    entity.getMaNV()
            );
        } catch (Exception e) {
            System.out.println(e + "loi dong 55 nhan vien dao");
        }
    }

    public void delete(String key) {
        try {
            JdbcHelper.executeUpdate(DELETE_SQL, key);
        } catch (Exception ex) {
            System.out.println(ex + " loi dong 64 nhan vien dao");
        }
    }

    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public NhanVien selectById(String key) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<NhanVien> selectByKeyWord(String keyword){
        return this.selectBySql(SELECT_BY_KEYWORD, "%" + keyword + "%");
    }
    
    public void resetPassword(NhanVien entity){
        String sql = "UPDATE NHANVIEN SET MATKHAU = ? WHERE MANHANVIEN = ?";
        JdbcHelper.executeUpdate(sql, 
                entity.getMatKhau(),
                entity.getMaNV());
    }

    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;

            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NhanVien model = readFromResultSet(rs);
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

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString(1));
        model.setHoTen(rs.getString(2));
        model.setGioiTinh(rs.getBoolean(3));
        model.setNgaySinh(rs.getDate(4));
        model.setDienThoai(rs.getString(5));
        model.setLuong(rs.getFloat(6));
        model.setEmail(rs.getString(7));
        model.setVaiTro(rs.getInt(8));
        model.setMatKhau(rs.getString(9));
        model.setDiaChi(rs.getString(10));
        model.setMaCuaHang(rs.getString(11));
        return model;
    }

}
