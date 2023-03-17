package com.itheima.edu.info.reStudy;

import java.io.*;

public class bufferOfCopy {
    public static void main(String[] args)throws IOException {
        method1();
    }

    public static void method1()throws IOException {
        //创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\itTiger.txt"));
        //创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\itTiger.txt"));
        //一次读一个数据
        int len;
        byte[]b = new byte[1024];
        while ((len = bis.read(b))!=-1){
            //write（char []，int，int）
            //char - 字符串
            //off - 开始编写字符的偏移量
            //len - 要写入的 len数
            bos.write(b,0, len);

        }

    }
}
