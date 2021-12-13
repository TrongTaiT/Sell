/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.KhachHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenTruongChinh
 */
public class KhachHangDAO extends SellDAO<KhachHang, String>{
    
    String SQL_INSERT = "INSERT INTO KhachHang (MaKhachHang, HoTen, GioiTinh, NgaySinh, DienThoai, "
            + "Email, DiaChi, NgayDK) VALUES (?,?,?,?,?,?,?,?)";
    String SQL_UPDATE = "UPDATE KhachHang SET HoTen = ?, GioiTinh = ?, NgaySinh = ?, DienThoai = ?, "
            + "Email = ?, DiaChi = ?, NgayDK = ? WHERE MaKhachHang = ?";
    String SQL_DELETE = "DELETE FROM KhachHang WHERE MaKhachHang = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KhachHang";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE MaKhachHang = ?";
    String SELECT_BY_KEYWORD = "SELECT * FROM KhachHang WHERE HoTen LIKE ?";
    
    @Override
    public void insert(KhachHang entity) {
        JdbcHelper.executeUpdate(SQL_INSERT,
                entity.getMaKhachHang(),
                entity.getHoTen(),
                entity.getGioiTinh(),
                entity.getNgaySinh(),
                entity.getDienThoai(),
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getNgayDK());
    }

    @Override
    public void update(KhachHang entity) {
        JdbcHelper.executeUpdate(SQL_UPDATE,
                entity.getHoTen(),
                entity.getGioiTinh(),
                entity.getNgaySinh(),
                entity.getDienThoai(),
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getNgayDK(),
                entity.getMaKhachHang());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.executeUpdate(SQL_DELETE, key);
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    public List<KhachHang> selectByKeyWord(String keyword){
        return this.selectBySql(SELECT_BY_KEYWORD, "%" + keyword + "%");
    }

    @Override
    public KhachHang selectById(String key) {
        List<KhachHang> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<KhachHang>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while(rs.next()){
                KhachHang entity = new KhachHang();
                entity.setMaKhachHang(rs.getString("MaKhachHang"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setNgayDK(rs.getDate("NgayDK"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        List<KhachHang> list = new ArrayList<>();
//        try {
//            ResultSet rs = null;
//
//            try {
//                rs = JdbcHelper.executeQuery(sql, args);
//                while (rs.next()) {
//                    KhachHang model = readFromResultSet(rs);
//                    list.add(model);
//                }
//            } finally {
//                rs.getStatement().getConnection().close();
//            }
//        } catch (Exception ex) {
//            throw new RuntimeException(ex);
//        }
//        return list;
    }
    
//    private KhachHang readFromResultSet(ResultSet rs) throws SQLException {
//        KhachHang model = new KhachHang();
//        model.setMaKhachHang(rs.getString(1));
//        model.setHoTen(rs.getString(2));
//        model.setGioiTinh(rs.getBoolean(3));
//        model.setNgaySinh(rs.getDate(4));
//        model.setDienThoai(rs.getString(5));
//        model.setEmail(rs.getString(6));
//        model.setDiaChi(rs.getString(7));
//        model.setNgayDK(rs.getDate(8));
//        return model;
//    }
}
