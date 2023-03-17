package com.itheima.edu.info.reStudy;

import java.io.FileInputStream;
import java.io.IOException;

public class readOfIO2 {
    public static void main(String[] args)throws IOException {
        //创建字节流输入对象
        FileInputStream fis = new FileInputStream("E:\\itcat\\itTiger.txt");
        //一个字节一个字节的读取数组数据
        int len ;
        byte[]b = new byte[1024];//可以为1024的整数倍
        while ((len = fis.read())!=-1){
            System.out.print(new String(b,0,len));

        }
        fis.close();



    }
}
