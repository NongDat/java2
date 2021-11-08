/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5_NongVanDatPH18618;

/**
 *
 * @author nongvandat
 */
public class MainBai1 {

    public static void main(String[] args) {
        byte[] data = XFile.read("/Users/nongvandat/NetBeansProjects/JAVA2/demo_file_io.txt");
        System.out.println("File đang được sao chép...");
        XFile.write("/Users/nongvandat/NetBeansProjects/JAVA2/demo_file_io_2.txt",data);
        System.out.println("result :"+ new String(data));
        
    }
    
}
