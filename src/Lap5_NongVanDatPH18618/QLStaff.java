/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5_NongVanDatPH18618;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public class QLStaff implements QLStaffInterface{
   private List<Staff> list ;

    public QLStaff() {
        this.list = new ArrayList<>();
    }

    @Override
    public void addStaff(Staff n) {
        this.list.add(n);
    }

    @Override
    public List<Staff> getLisst() {
        return this.list;
    }

    @Override
    public void setList(List<Staff> list) {
        this.list = list;
    }
   
}
