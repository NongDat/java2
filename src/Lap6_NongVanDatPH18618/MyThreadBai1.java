/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap6_NongVanDatPH18618;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class MyThreadBai1 implements Runnable {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThreadBai1());
        Thread t2 = new Thread(new MyThreadBai1());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        System.out.println("Thứ tự ưu tiên t1 :" + t1.getPriority());
        System.out.println("");
        t2.start();
        System.out.println("Thứ tự ưu tiên t2 :" + t2.getPriority());
        System.out.println("");
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                break;
            }
        }

    }

}
