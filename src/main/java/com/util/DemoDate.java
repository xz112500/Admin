package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
    public static String NewDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

   /* public static void main(String[] args) {
        System.out.println( DemoDate.NewDate(new Date()));
    }*/
}
