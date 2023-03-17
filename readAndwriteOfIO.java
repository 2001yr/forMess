package com.itheima.edu.info.reStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class readAndwriteOfIO {
    public static void main(String[] args) {
       // FileOutputStream fos = null;
       // FileInputStream fis = null;
        //定义一个字节byte类型的数值
        byte[]b = new byte[1024];
        int len;
        //可能出现异常的代码
        try {
            FileInputStream fis = new FileInputStream("E:\\itcat\\dog.txt");
            FileOutputStream fos = new FileOutputStream("E:\\itTiger.txt");
            while ((len = fis.read())!=-1) {
                fos.write(b, 0, len);
            }
            fis.close();
            fos.close();
            //异常类 变量名
        }catch (IOException e){
            e.printStackTrace();
        }
                }
            }

