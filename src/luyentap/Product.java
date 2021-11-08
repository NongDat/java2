/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap;

import java.io.Serializable;

/**
 *
 * @author nongvandat
 */
public class Product implements Serializable{

    private String tenSP,maSP,loai;
    private int tinhTrang;
    private double gia;

    public Product() {
    }

    public Product(String tenSP, String maSP, String loai, int tinhTrang, double gia) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.loai = loai;
        this.tinhTrang = tinhTrang;
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
    
}
