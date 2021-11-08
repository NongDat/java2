/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public class QLSP implements QLSPInterface<Product>{

    private List<Product>list;
    public QLSP(){
        this.list = new ArrayList<>();
    }

    @Override
    public void them(Product n) {
        this.list.add(n);
    }

    @Override
    public void sua(int index, Product n) {
        this.list.set(index, n);
    }

    @Override
    public void xoa(int index) {
        this.list.remove(index);
    }

    @Override
    public List<Product> openFile(String path) {
        this.list.clear();
        this.list = (List<Product>) XFile.readObject(path);
        return this.list;
    }

    @Override
    public void saveFile(String path, List<Product> list) {
        XFile.writeObject(path, list);
    }

    @Override
    public List<Product> xepTen() {
        Collections.sort(this.list, (z1,z2)->z1.getTenSP().compareToIgnoreCase(z2.getTenSP()));
        return this.list;
    }

    @Override
    public List<Product> xepGia() {
        Collections.sort(this.list, (d1,d2)->Double.compare(d1.getGia(), d2.getGia()));
        return this.list;
    }

    @Override
    public List<Product> getList() {
        return this.list;
    }

    @Override
    public void setList(List<Product> list) {
        this.list = list;
    }
  
    
}
