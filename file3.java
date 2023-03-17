package com.itheima.edu.info.reStudy;

import java.io.File;
import java.io.IOException;

public class file3 {
    public static void main(String[] args) throws IOException {
        //我要在E:\\itcat下创建一个文件java.txt
        File F1 = new File("E:\\itcat\\java.txt");
        System.out.println(F1.createNewFile());
        System.out.println("---------------");
        //我要在E:\\itcat下创建一个目录javaEE
        File F2 = new File("E:\\itcat\\javaEE");
        System.out.println(F2.mkdir());
        System.out.println("---------------");
        //我要在E:\\itcat下创建一个多级目录javaWBE\\HTML
        File F3 = new File("E:\\itcat\\javaWEB\\HTML");
        System.out.println(F3.mkdirs());
        //输出的返回值为boolean类型

        //删除功能delete()
        File F4 = new File("E:\\itcat\\java.txt");
        System.out.println(F1.delete());
    }
}
