package com.itheima.edu.info.reStudy;

import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
    //IO流:Input /Output 输入，输出 数据在设备之间的传输称之为流，流的本质是数据传输   ...常见的问题有文件复制，文件上传，文件下载
    //输入流:读数据   输出流:写数据
    /*字节流有  字节输入流 字节输出流
      字符流有  字符输入流 字符输出流
      应用场景: 如果操作的使纯文本文件，优先字符流
               如果操作的是图片，视频，音频等二进制文件，优先使用字节流
               若不确定文件类型，优先使用字节流，字节流是万能的流
               字节流操作的基本单元为字节；字符流操作的基本单元为Unicode码元
               字节流不需要缓冲区
     */
    public static void main(String[] args)throws IOException {
        //字节输出，即文件输出创建对象
        FileOutputStream is = new FileOutputStream("myFavorate.txt");
        //指定的字节写入c此文件输出流
        is.write(99);
        //最后需要释放资源
        System.out.println("--------------------------");
        /*字节流写数据的三种方式 write()
        write(int b)
        write(byte[]b)
        write(byte[]b,int pff,int len):将len数组从指定的字节数组开始，从偏移量off开始写入文件输出流，一次写一个字节数组的部分数据
         */
       byte[]b ={20,23,89,88};
       is.write(b);
       is.write(b, 2, 2);//从2开始输出，长度为2，注意长度取值，不然会报错
        System.out.println(b);//直接输出会输出地址
        //释放资源，最后一步
        is.close();



    }
}
