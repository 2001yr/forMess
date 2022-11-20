package com.itheima.edu.info.Time.Date;

import java.util.Date;

public class demo2 {
    public static void main(String[] args) {
        Date date = new Date();
       long d =System.currentTimeMillis();
        date.setTime(d);
        System.out.println(d*1/365/24/60/60/1000 + "年");
    }
}
