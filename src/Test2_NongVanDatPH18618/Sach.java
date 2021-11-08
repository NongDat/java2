/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2_NongVanDatPH18618;

import java.io.Serializable;

/**
 *
 * @author nongvandat
 */
public class Sach implements Serializable{

    private String maSach,tenSach,tinhTrang;
    private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tinhTrang, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tinhTrang = tinhTrang;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
   
    
}
