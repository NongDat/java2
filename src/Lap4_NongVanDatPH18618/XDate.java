/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap4_NongVanDatPH18618;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nongvandat
 */
public class XDate {
    private static SimpleDateFormat formater = new SimpleDateFormat();
    public static Date parse(String text) throws RuntimeException{
        
        return XDate.parse(text,"dd-MM-yyyy");
    }

    static Date parse(String text, String pattern) throws RuntimeException{
        
        try {
            formater.applyPattern(pattern);
            return formater.parse(text);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    
}
