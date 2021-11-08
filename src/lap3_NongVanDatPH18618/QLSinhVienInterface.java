/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_NongVanDatPH18618;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public interface QLSinhVienInterface {
    public void addStudent(SinhVien n);
    public void removeStudent(int viTri);
    public void updateStudent(int viTri,SinhVien n);
    public List<SinhVien> orderByMarks();
    public List<SinhVien> orderByName();
    public List<SinhVien> getList();
    public void setList(List<SinhVien> list);
    
}
