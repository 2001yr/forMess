package com.itheima.edu.info.Time.Date;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time2OfJDK8 {
    public static void main(String[] args) {
        //LocalDateTime格式化与解析
        String s = "2001年2月24日 13：14:15";
       DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");  //解析格式，使用指定的日期模板获取一个日期格式化器
        LocalDateTime parse = LocalDateTime.parse(s,pattern);//把一个字符串按照写好的模板解析成一个LocalDateTime对象
        System.out.println(parse);
        //------------------------------------
       LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 12, 16, 36);
        String B =  localDateTime.format(pattern);//将一个localDateTime对象格式化为一个字符串

    }
}
