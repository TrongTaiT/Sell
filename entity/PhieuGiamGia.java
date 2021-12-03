
package com.Sell.entity;

import java.util.Date;

public class PhieuGiamGia {
    String maGiamGia ;
    Date ngayGiamGia ;
    String maKhachHang ;
    Boolean trangThai ;

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public Date getNgayGiamGia() {
        return ngayGiamGia;
    }

    public void setNgayGiamGia(Date ngayGiamGia) {
        this.ngayGiamGia = ngayGiamGia;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
