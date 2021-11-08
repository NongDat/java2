/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5_NongVanDatPH18618;

import java.util.List;

/**
 *
 * @author nongvandat
 */
public interface QLStaffInterface {
    public void addStaff(Staff n);
    
    public List<Staff> getLisst();
    public void setList(List<Staff> list);
}
