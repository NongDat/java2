/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_NongVanDatPH18618;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nongvandat
 */
public class MapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,SinhVien> map = new HashMap<>();
        SinhVien sv1 = new SinhVien();
    for(int i = 0; i < map.size() ; i++){
        sv1.name = "Tuấn";
        sv1.major="CNTT";
        sv1.marks= 7.0;
        map.put(sv1.name, sv1);
    }
      
        
        Set<String> keys = map.keySet();
        for(String name : keys){
            SinhVien sv = map.get(name);
            System.out.println("Họ tên:"+sv.name);
            System.out.println("Học lực : "+ sv.getGrade());
        }
    }
    
}
