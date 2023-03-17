package com.itheima.edu.info.reStudy;

import java.io.File;
import java.io.IOException;

public class file4 {
    public static void main(String[] args)throws IOException {
        File F1 = new File("E:\\itcat");
        //Boolean
        System.out.println(F1.isFile());//是否为文件
        System.out.println(F1.isDirectory());//是否为目录
        System.out.println(F1.exists());//是否存在
        //String
        System.out.println(F1.getAbsoluteFile());//返回此抽象路径名的绝对路径字符串
        System.out.println(F1.getName());//返回由此抽象路径名表示的文件或目录的名称
        System.out.println(F1.getPath());//将此抽象路径名转换为路径字符串

        File F2 =new File("E:\\itcat");
        File[]files = F2.listFiles();
        for (File F:files){
            if (F1.isFile()){
                System.out.println(F2.getName());
                 }
         }

    }
}
