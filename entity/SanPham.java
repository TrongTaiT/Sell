/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.entity;

/**
 *
 * @author trongtai
 */
public class SanPham {

    private String maSanPham;
    private String tenSP;
    private String nhaSX;
    private String ghiChu;
    private String maLoai;
    private  Float GiaTien;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSP, String nhaSX, String ghiChu) {
        this.maSanPham = maSanPham;
        this.tenSP = tenSP;
        this.nhaSX = nhaSX;
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return this.tenSP+" ("+nhaSX+")";
    }

    @Override
    public boolean equals(Object obj) {
        SanPham other = (SanPham) obj;
        return other.getMaSanPham().equals(this.getMaSanPham());
    }
        //getters && setters

    public Float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(Float GiaTien) {    
        this.GiaTien = GiaTien;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

}
