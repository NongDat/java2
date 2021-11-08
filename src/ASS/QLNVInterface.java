/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS;

import java.util.List;

/**
 *
 * @author nongvandat
 */
public interface QLNVInterface<E> {
    public int findByID(String id);
    public int save(E n);
    public int delete(String id);
    public List<E> openFile(String path);
    public void saveFile(String path,List<E> list);
    public List<E> getList();
    public void setList(List<E>list);
}
