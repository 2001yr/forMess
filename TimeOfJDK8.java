package com.itheima.edu.info.Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeOfJDK8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //----------------------
        LocalDateTime localDateTime = LocalDateTime.of(2001, 2, 24, 00, 00);
        System.out.println(localDateTime);
       //--------LocalDateTime获取方法
        int year =   localDateTime.getYear();
        int month = localDateTime.getMonthValue(); //注意返回值
        int day = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        System.out.println(minute);
        //--------LocalDateTime转换
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);
    }
}
