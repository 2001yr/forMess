package com.itheima.edu.info.reStudy;

import java.io.FileInputStream;
import java.io.IOException;

public class readOfIO {
    public static void main(String[] args)throws IOException {
        //创建字节流输入对象
        FileInputStream fi =new FileInputStream("myfavorate.txt");
        int by;
        while ((by=fi.read())!=-1){//把读取到的数据传给by，判断读取到的数据是否是-1
            System.out.println((char) by);
            //释放资源
            fi.close();
        }
    }
}
