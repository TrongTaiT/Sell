package com.Sell.entity;

import java.util.Date;

public class NhanVien {

    //11 cai
    String maNV;
    String hoTen;
    Date ngaySinh;
    String dienThoai;
    String email;
    Float luong;
    int vaiTro;
    String matKhau;
    String diaChi;
    String maCuaHang;
    Boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, Date ngaySinh, String dienThoai, String email, Float luong, int vaiTro, String matKhau, String diaChi, String maCuaHang, Boolean gioiTinh) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.email = email;
        this.luong = luong;
        this.vaiTro = vaiTro;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.maCuaHang = maCuaHang;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return this.maCuaHang;
    }

    @Override
    public boolean equals(Object obj) {
        NhanVien other = (NhanVien) obj;
        return other.getMaNV().equals(this.getMaNV());
    }

    // getters && setters
    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public String getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(String maCuaHang) {
        this.maCuaHang = maCuaHang;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
