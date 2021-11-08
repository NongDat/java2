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
public class OddThread_B3 extends Thread{

        @Override
        public void run(){
            for(int i = 1; i <10 ;i += 2){
                System.out.print(" "+i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                    break;
                }
            }
        }
    
}
