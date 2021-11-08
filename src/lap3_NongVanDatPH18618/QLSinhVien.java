/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_NongVanDatPH18618;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public class QLSinhVien implements QLSinhVienInterface{

    private List<SinhVien> list;
    public QLSinhVien(){
        this.list = new ArrayList<>();
    }

    @Override
    public void addStudent(SinhVien n) {
        this.list.add(n);
    }

    @Override
    public void removeStudent(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public void updateStudent(int viTri, SinhVien n) {
        this.list.set(viTri, n);
    }

    @Override
    public List<SinhVien> getList() {
        return this.list;
    }

    @Override
    public void setList(List<SinhVien> list) {
        this.list=list;
    }

    @Override
    public List<SinhVien> orderByMarks() {
          List<SinhVien> list = getList();
         
         Comparator<SinhVien> com = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                Double d1 = o1.getMarks();
                Double d2 = o2.getMarks();
                System.out.println(d1.compareTo(d2));
                if(d1 == d2){
                    return 0;
                }else if(d1 > d2){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(list, com);
          
          return list;
    }

    @Override
    public List<SinhVien> orderByName(){
         List<SinhVien> list = getList();
        Comparator<SinhVien> com = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                    int i1 = o1.getName().indexOf(" "),
                        i2 = o2.getName().indexOf(" ");
                    String name1 = o1.getName().substring(i1),
                            name2 = o2.getName().substring(i2);
                return name1.compareTo(name2);
            }
        };
        Collections.sort(list, com);
        return list;
    }
    
}
