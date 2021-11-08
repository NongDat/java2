/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5_NongVanDatPH18618;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nongvandat
 */
public class MainBai2 {

    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("Nông Đạt", "UDPM", 9.5));
        list.add(new SinhVien("Lâm Quế", "WEB", 8));
        list.add(new SinhVien("Xuân Trường", "WEB", 7));
        list.add(new SinhVien("Văn Sơn", "MOB", 8.5));
        //ghi file 
        XFile.writeObject("/Users/nongvandat/NetBeansProjects/JAVA2/Bai2_Object_io.txt", list);
        //đọc file 
        List<SinhVien> list2 = (List<SinhVien>) XFile.readObject("/Users/nongvandat/NetBeansProjects/JAVA2/Bai2_Object_io.txt");
        for (SinhVien sv : list) {
            System.out.println("Họ tên :" + sv.getName());
            System.out.println("Điểm :" + sv.getMarks());
            System.out.println("Ngành :" + sv.getMajor());
            System.out.println("Học lực :" + sv.getGrade());
            System.out.println("");

        }
    }

}
