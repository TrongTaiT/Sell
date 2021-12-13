package com.Sell.DAO;

import com.Sell.Helper.JdbcHelper;
import com.Sell.entity.HoaDonChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonChiTiet_DAO {

    String INSERT_SQL = "INSERT INTO [HoaDonChiTiet] VALUES (?, ?, ?, ? )";
    String UPDATE_SQL = "UPDATE HoaDonChiTiet SET SoLuong= ? where MaHDBan= ? and MaSanPham = ?";
    String DELETE_SQL = "DELETE FROM HoaDonChiTiet WHERE MaHDBan = ? and  MaSanPham=?";
    //dang sua
    String SELECT_ALL_SQL = "SELECT * FROM HoaDonChiTiet WHERE MaHDBan = ?";

    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDonChiTiet WHERE MaHDBan = ?";

    String SELECT_IN = "SELECT * FROM HOADONCHITIET WHERE MASANPHAM = ?";

    public void insert(HoaDonChiTiet entity) {
        try {
            JdbcHelper.executeUpdate(INSERT_SQL,
                    entity.getMaHDBan(),
                    entity.getMaSanPham(),
                    entity.getSoLuong(),
                    entity.getThanhTien()
            );
        } catch (Exception e) {
            System.out.println(e + "loi dong 45 hoa don dao");
        }
    }

    public void update(HoaDonChiTiet entity) {
        try {
            JdbcHelper.executeUpdate(UPDATE_SQL,
                    entity.getSoLuong(),
                    entity.getMaHDBan(),
                    entity.getMaSanPham()
            );
        } catch (Exception e) {
            System.out.println(e + "loi dong 55 hoa phieu giam gia vien dao");
        }
    }
    
 

    public void delete(String key, String key2) {
        try {
            JdbcHelper.executeUpdate(DELETE_SQL, key, key2);
        } catch (Exception ex) {
            System.out.println(ex + " loi dong 64 nhan vien dao");
        }
    }

    public List<HoaDonChiTiet> selectAll(String key) {
        return this.selectBySql(SELECT_ALL_SQL, key);
    }

    public HoaDonChiTiet selectById(String key) {
        List<HoaDonChiTiet> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<HoaDonChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;

            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonChiTiet model = readFromResultSet(rs);
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

    private HoaDonChiTiet readFromResultSet(ResultSet rs) throws SQLException {

        HoaDonChiTiet model = new HoaDonChiTiet();

        model.setMaHDBan(rs.getString(1));
        model.setMaSanPham(rs.getString(2));
        model.setSoLuong(rs.getString(3));
        model.setThanhTien(rs.getFloat(4));

        return model;
    }

}
