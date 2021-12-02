/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.entity;

import java.util.Date;

/**
 *
 * @author NguyenTruongChinh
 */
public class KhachHang {
    String maKhachHang ;
    String hoTen;
    Date ngaySinh;
    String dienThoai;
    String email;
    Date ngayDK;
    String diaChi;
    boolean gioiTinh;

    public KhachHang(String maKhachHang, String hoTen, Date ngaySinh, String dienThoai, String email, Date ngayDK, String diaChi, boolean gioiTinh) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ngayDK = ngayDK;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public KhachHang() {
    }

    
    @Override
    public String toString() {
        return this.maKhachHang+": "+ this.hoTen;
    }

    @Override
    public boolean equals(Object obj) {
        KhachHang ch = (KhachHang) obj;
        return ch.getMaKhachHang().equals(this.getMaKhachHang());
    }
    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
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

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
