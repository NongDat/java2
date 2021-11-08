/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_NongVanDatPH18618;

import java.io.Serializable;

/**
 *
 * @author nongvandat
 */
public class SinhVien implements Serializable{

    String name;
    String major;
    double marks;

    public SinhVien() {
    }

    public SinhVien(String name, String major, double marks) {
        this.name = name;
        this.major = major;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    public String getGrade(){
        if(this.marks <3){
            return "Kém";
        }else if(this.marks <5){
            return "Yếu";
        }else if(this.marks <6.5){
            return "Trung bình";
        }else if(this.marks <7.5){
            return "Khá";
        }else if(this.marks <9){
            return "Giỏi";
        }else{
            return "Xuất sắc";
        }
    }
    public boolean isBonus(){
        return this.marks >= 7.5;
    }
}
