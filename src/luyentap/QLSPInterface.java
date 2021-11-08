/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap;

import java.util.List;

/**
 *
 * @author nongvandat
 */
public interface QLSPInterface<E> {
    public void them(E n);
    public void sua(int index,E n);
    public void xoa(int index);
    public List<E> openFile(String path);
    public void saveFile(String path,List<E> list);
    public List<E> xepTen();
    public List<E> xepGia();
    public List<E> getList();
    public void setList(List<E> list);
}
