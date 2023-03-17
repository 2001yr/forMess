package com.itheima.edu.info.reStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyOfIO {
    public static void main(String[] args)throws IOException {
        //字节流复制文件
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("E:\\itdog\\dog.txt");
        //创建字节输出流
        FileOutputStream fos = new FileOutputStream("E:\\itcat\\dog.txt");
        //读写数据，复制文本文件(一次读写一个字节，一次写入一个字节)
        int by;
        while ((by=fis.read())!=-1){  //注意括号！用来传送数据,读
            fos.write((char)by);//写
            //释放资源
        }
          fis.close();  //注意关闭流的位置
          fos.close();
    }

}
