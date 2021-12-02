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
public class LoaiHang {

    String maLoai;
    String tenLoai;
    String ghiChu;

    public LoaiHang(String maLoai, String tenLoai, String ghiChu) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.ghiChu = ghiChu;
    }

    public LoaiHang() {
    }

    @Override
    public String toString() {
        return this.tenLoai + "";
    }

    @Override
    public boolean equals(Object obj) {
        LoaiHang other = (LoaiHang) obj;
        return other.getMaLoai().equals(this.getMaLoai());
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
