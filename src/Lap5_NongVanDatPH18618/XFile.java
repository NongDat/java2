/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5_NongVanDatPH18618;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import lap3_NongVanDatPH18618.SinhVien;

/**
 *
 * @author nongvandat
 */
public class XFile {
    //FileIOStream

    public static byte[] read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return data;

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Đọc file thất bại");
            return null;
        }
    }

    public static void write(String path, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }

    //ObjectIOStream
    public static Object readObject(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object =ois.readObject();
            ois.close();
            return object;
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Đọc file thất bại");
            return null;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Đọc file thất bại");
            return null;
        }
    }
    public static void writeObject(String path,Object object){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            oos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }

}
