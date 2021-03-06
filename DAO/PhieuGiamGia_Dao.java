package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.PhieuGiamGia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PhieuGiamGia_Dao {

    String INSERT_SQL = "INSERT INTO PhieuGiamGia VALUES (?, ?, ?, ? )";
    String UPDATE_SQL = "UPDATE PhieuGiamGia SET NgayGiamGia = ?, GiamGia = ?, MaKhachHang = ?, TrangThai = ? where MaGiamGia= ?";
    String DELETE_SQL = "DELETE FROM PhieuGiamGia WHERE MaGiamGia = ?";
    String SELECT_ALL_SQL = "SELECT * FROM PhieuGiamGia";
    String SELECT_BY_ID_SQL = "SELECT * FROM PhieuGiamGia WHERE MaGiamGia = ?";
    String SELECT_BY_MAKH = "SELECT * FROM PHIEUGIAMGIA WHERE MAKHACHHANG = ?";
    String SELECT_IN = "SELECT MAKHACHHANG FROM PHIEUGIAMGIA WHERE MAKHACHHANG IN(SELECT MAKHACHHANG FROM HOADONBANHANG)";
    
    public void insert(PhieuGiamGia entity) {
        try {
            JdbcHelper.executeUpdate(INSERT_SQL,
                    entity.getNgayGiamGia(),
                    entity.getGiamGia(),
                    entity.getMaKhachHang(),
                    entity.getTrangThai()
            );
        } catch (Exception e) {
        }
    }

    public void update(PhieuGiamGia entity) {
        try {
            JdbcHelper.executeUpdate(UPDATE_SQL,
                    entity.getNgayGiamGia(),
                    entity.getGiamGia(),
                    entity.getMaKhachHang(),
                    entity.getTrangThai(),
                    entity.getMaGiamGia()
            );
        } catch (Exception e) {
            System.out.println(e + "loi dong 55 hoa phieu giam gia vien dao");
        }
    }

    public void delete(String key) {
        try {
            JdbcHelper.executeUpdate(DELETE_SQL, key);
        } catch (Exception ex) {
            System.out.println(ex + " loi dong 64 nhan vien dao");
        }
    }

    public List<PhieuGiamGia> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    public PhieuGiamGia selectByMaKH(String key) {
        List<PhieuGiamGia> list = this.selectBySql(SELECT_BY_MAKH, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<PhieuGiamGia> selectIn(String maKH){
        return this.selectBySql(SELECT_IN, maKH);
    }

    public PhieuGiamGia selectById(String key) {
        List<PhieuGiamGia> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<PhieuGiamGia> selectBySql(String sql, Object... args) {
        List<PhieuGiamGia> list = new ArrayList<>();
        try {
            ResultSet rs = null;

            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    PhieuGiamGia model = readFromResultSet(rs);
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

    private PhieuGiamGia readFromResultSet(ResultSet rs) throws SQLException {

        PhieuGiamGia model = new PhieuGiamGia();

        model.setMaGiamGia(rs.getString(1));
        model.setNgayGiamGia(rs.getDate(2));
        model.setGiamGia(rs.getInt(3));
        model.setMaKhachHang(rs.getString(4));
        model.setTrangThai(rs.getBoolean(5));

        return model;
    }

}
