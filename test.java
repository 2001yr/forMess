package com.itheima.edu.info.Time.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        String time = "2020年11月11日 00:00:00";
        String end = "2020年11月11日 00:10:00";
        String jia = "2020年11月11日 00:03:47";
        String pi = "2020年11月11日 00:10:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long start = sdf.parse(time).getTime();
        long over = sdf.parse(end).getTime();
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();
        if (jiaTime - start >= over - start){
            System.out.println("小贾同学未能参与");
        }else System.out.println("小贾同学成功参与！");
        System.out.println("-----------------------");
        if (piTime - start >=over - start){
            System.out.println("小皮同学未能参与");
        }else System.out.println("小皮同学成功参与！");
    }
}
