package com.itheima.edu.info.Time;

import java.time.LocalDateTime;

public class Time3OfJDK8 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2001, 2, 24, 11, 12,55
        );
        //LocalDateTime增加或减少时间的方法---------
        //   1.正数代表增加
       LocalDateTime plus =  localDateTime.plusYears(-1);
        localDateTime.plusMonths(5);
        localDateTime.plusDays(2);
        localDateTime.plusHours(4);
        localDateTime.plusMinutes(12);
        localDateTime.plusSeconds(4);
        localDateTime.plusWeeks(4);  //还有一个周运算
        System.out.println(plus);
         //   2.正数代表减少
       LocalDateTime minus =  localDateTime.minusYears(2);
       localDateTime.minusMonths(2);
       localDateTime.minusDays(0);
       localDateTime.minusHours(0);
       localDateTime.minusMinutes(45);
       localDateTime.minusSeconds(1);
       localDateTime.minusWeeks(1);
       //  两方法差距不大，大同小异
        System.out.println(minus);
    }
}
