/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS;

import java.io.Serializable;

/**
 *
 * @author nongvandat
 */
public class NhanVien implements Serializable{

    private String maNV,tenNV,Email;
    private int tuoi;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String Email, int tuoi, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.Email = Email;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
