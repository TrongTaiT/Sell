package com.Sell.DAO;

import com.Sell.Helper.DateHelper;
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
    String UPDATE_SQL = "UPDATE PhieuGiamGia SET NgayGiamGia = ?, MaKhachHang = ?, TrangThai = ? where MaGiamGia= ?";
    String DELETE_SQL = "DELETE FROM PhieuGiamGia WHERE MaGiamGia = ?";
    String SELECT_ALL_SQL = "SELECT * FROM PhieuGiamGia";
    String SELECT_BY_ID_SQL = "SELECT * FROM PhieuGiamGia WHERE MaGiamGia = ?";

    public void insert(PhieuGiamGia entity) {
        try {
            JdbcHelper.executeUpdate(INSERT_SQL,
                    entity.getMaGiamGia(),
                    DateHelper.toDate(entity.getNgayGiamGia(), "dd/MM/yyyy"),
                    entity.getMaKhachHang(),
                    entity.getTrangThai()
            );
        } catch (Exception e) {
            System.out.println(e + "loi dong 45 hoa don dao");
        }
    }

    public void update(PhieuGiamGia entity) {
        try {
            JdbcHelper.executeUpdate(UPDATE_SQL,
                    DateHelper.toDate(entity.getNgayGiamGia(), "dd/MM/yyyy"),
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

        try {
            model.setNgayGiamGia(DateHelper.toString(rs.getDate(2), "dd/MM/yyyy"));
        } catch (Exception e) {
            model.setNgayGiamGia("");
        }
        model.setMaKhachHang(rs.getString(3));
        model.setTrangThai(rs.getBoolean(4));

        return model;
    }

}
