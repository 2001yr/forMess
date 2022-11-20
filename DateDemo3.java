package com.itheima.edu.info.Time.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo3 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s =  sd.format(date); //格式化
        System.out.println(s);
        System.out.println("-------------");
        String b = "2001-12-12 11:11:11";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date dd = df.parse(b);
        System.out.println(dd);
    }
}
