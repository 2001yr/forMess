package com.itheima.edu.info.Time;

import java.time.LocalDateTime;

public class Time4OfJDK8 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 21, 17, 12,22);
        //LocalDateTime之直接修改时间
        LocalDateTime newYear =  localDateTime.withYear(2019);
            localDateTime.withMonth(8);
            localDateTime.withDayOfMonth(2); //直接修改一个月中的第几天
            localDateTime.withDayOfYear(165); //直接修改一年中的第几天
            localDateTime.withHour(5);
            localDateTime.withMinute(56);
            localDateTime.withSecond(56);
        System.out.println(newYear);
    }
}
