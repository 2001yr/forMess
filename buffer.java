package com.itheima.edu.info.reStudy;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class buffer {
    public static void main(String[] args)throws IOException {
        //字节缓冲输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("E:\\itTiger"));
        //写数据
        bufferedOutputStream.write("hello world\r\n".getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.write("hello bird".getBytes(StandardCharsets.UTF_8));
        //释放资源
        bufferedOutputStream.close();

        //字节缓冲输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\itTiger"));
        //读取数据
        byte[] b =new byte[1024];
        int len;
        //把读取到的数据传给len
        while ((len = bufferedInputStream.read())!=-1){
            System.out.print((char) len);
        }
        while ((len = bufferedInputStream.read(b))!=-1){
            System.out.print(new String(b,0,len));
        }
        bufferedInputStream.close();
    }
}
