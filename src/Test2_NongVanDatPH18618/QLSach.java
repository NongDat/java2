/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2_NongVanDatPH18618;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public class QLSach implements QLSachInterface<Sach>{

   private List<Sach> list;
   
   public QLSach(){
       this.list = new ArrayList<>();
   }

    @Override
    public void them(Sach n) {
        this.list.add(n);
    }

    @Override
    public void sua(int viTri, Sach n) {
        this.list.set(viTri, n);
    }

    @Override
    public void xoa(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public List<Sach> openFile(String path) {
        this.list.clear();
        this.list = (List<Sach>) XFile.readObject(path);
        return this.list;
    }

    @Override
    public void saveFile(String path, List<Sach> list) {
        XFile.writeObject(path, list);
    }

    @Override
    public List<Sach> getList() {
        return this.list;
    }

    @Override
    public void setList(List<Sach> list) {
        this.list = list;
    }
    
}
