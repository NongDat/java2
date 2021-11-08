/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5_NongVanDatPH18618;

import java.io.Serializable;

/**
 *
 * @author nongvandat
 */
public class Staff implements Serializable{

    private String fullName;
    private double salary;

    public Staff() {
    }

    public Staff(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String xuatTT(){
        return "fullName :"+this.fullName +
                "salary :"+this.salary;
    }
    
}
