/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap3;

import java.util.List;

/**
 *
 * @author nongvandat
 */
public interface QLSVInterface<E> {
    public void them(E n);
    public void sua(int index,E n);
    public void xoa(int index);
    public List<E> openFile(String path);
    public void saveFile(String path,List<E> list);
    public List<E> getOrderByMarks();
    public List<E> getOrderByName();
    public List<E> getList();
    public void setList(List<E> list);
}
