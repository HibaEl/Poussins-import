/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Import.common.util;

import java.math.BigDecimal;

/**
 *
 * @author YOUNES
 */
public class NumberUtil {
    private static final String CHAINE_VIDE=""; 
    
    public static int toInt(String value){
        if(value==null || value.isEmpty()){
            return 0;
        }else{
            return Integer.parseInt(value);
        }
    }
    public static Double toDouble(String value){
        if(value==null || value.isEmpty()){
            return 0D;
        }else{
            return Double.parseDouble(value);
        }
    }
    public static String toStringD(double value){
        if(value==0){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
     public static String toStringI(int value){
        if(value==0){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
}
