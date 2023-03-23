package com.itheima.edu.info.reStudy;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IO2 {
    //字符流=字节流+编码表
    //汉字在存储时，无论选择哪种编码存储，第一个字节都是负数
    public static void main(String[] args)throws UnsupportedEncodingException {
        String s = "中国";
        //使用指定的字符集将该String编码为一系列字符集
      byte[]b  = s.getBytes("GBK");
        //使用平台默认的字符集将该String编码为一系列字符集
     // byte[]c = s.getBytes();
        System.out.println(Arrays.toString(b));
        //使用平台默认字符集解码指定的字节数组来创建字符串
        String bb = new String(b);
        //使用指定的字符集解码指定的字节数组来创建字符串
        String ss = new String(b,"UTF-8");
    }
}
