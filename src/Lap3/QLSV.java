/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public class QLSV implements QLSVInterface<SinhVien>{

    private List<SinhVien>list;
    public QLSV(){
        this.list = new ArrayList<>();
    }

    @Override
    public void them(SinhVien n) {
        this.list.add(n);
    }

    @Override
    public void sua(int index, SinhVien n) {
        this.list.set(index, n);
    }

    @Override
    public void xoa(int index) {
        this.list.remove(index);
    }

    @Override
    public List<SinhVien> openFile(String path) {
        this.list.clear();
        this.list = (List<SinhVien>) XFile.readObject(path);
        return this.list;
    }

    @Override
    public void saveFile(String path, List<SinhVien> list) {
        XFile.writeObject(path, list);
    }

    @Override
    public List<SinhVien> getList() {
        return this.list;
    }

    @Override
    public void setList(List<SinhVien> list) {
        this.list = list;
    }

    @Override
    public List<SinhVien> getOrderByMarks() {
        Collections.sort(this.list, (a1,a2)->Double.compare(a1.getMarks(), a2.getMarks()));
        return this.list;
    }

    @Override
    public List<SinhVien> getOrderByName() {
        Collections.sort(this.list, (z1,z2)->z1.getName().substring(z1.getName().lastIndexOf(" ")).compareToIgnoreCase(z2.getName().substring(z2.getName().lastIndexOf(" "))));
        return this.list;
    }
    
}
