/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.entity;

/**
 *
 * @author NguyenTruongChinh
 */
public class CuaHang {

    private String maCH;
    private String diaChi;
    private String maQuanLy;
    private boolean trangThai;

    public CuaHang() {
    }

    public CuaHang(String maCH, String diaChi, String maQuanLy, boolean trangThai) {
        this.maCH = maCH;
        this.diaChi = diaChi;
        this.maQuanLy = maQuanLy;
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return this.maCH + " (" + diaChi + ")";
    }

    @Override
    public boolean equals(Object obj) {
        CuaHang ch = (CuaHang) obj;
        return ch.getMaCH().equals(this.getMaCH());
    }

    // getters && setters
    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaQuanLy() {
        return maQuanLy;
    }

    public void setMaQuanLy(String maQuanLy) {
        this.maQuanLy = maQuanLy;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
