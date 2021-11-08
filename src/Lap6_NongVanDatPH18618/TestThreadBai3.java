
package Lap6_NongVanDatPH18618;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class TestThreadBai3 {

    public static void main(String[] args) {
      OddThread_B3 t1 = new OddThread_B3();
      EvenThread_B3 t2 = new EvenThread_B3();
      t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println();
      t2.start();
      System.out.println( "");
    }
    
}
