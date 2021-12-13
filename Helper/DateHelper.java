/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NguyenTruongChinh
 */
public class DateHelper {
    
    static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    
    public static Date now(){
        return new Date();
    }
    
    public static Date getDay(String date){
        try {
            fmt.applyPattern("dd");
            return fmt.parse(date);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    
    
    // Đổi định dạng từ string qua ngày
    public static Date toDate(String date, String pattern){
        try {
            fmt.applyPattern(pattern);
            return fmt.parse(date);
            
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public static Date toDate(String date){
        try {
            fmt.applyPattern("dd/MM/yyyy");
            return fmt.parse(date);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    //Đổi định dạng từ date to String
    public static String toString(Date date, String pattern){
        fmt.applyPattern(pattern);
        return fmt.format(date)+"";
    }
    
    public static String toString(Date date){
        fmt.applyPattern("dd/MM/yyyy");
        return fmt.format(date);
    }
    
    public static Date addDays(Date date, long days){
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }
    
}
