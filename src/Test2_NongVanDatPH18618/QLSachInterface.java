/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2_NongVanDatPH18618;

import java.util.List;

/**
 *
 * @author nongvandat
 */
public interface QLSachInterface<E> {
    public void them(E n);
    public void sua(int viTri ,E n);
    public void xoa(int viTri);
    public List<E> openFile(String path);
    public void saveFile(String path,List<E> list);
    public List<E> getList();
    public void setList(List<E> list);
    
}
