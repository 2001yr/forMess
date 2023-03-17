package com.itheima.edu.info.reStudy;

import java.io.File;

public class file {
    public static void main(String[] args) {
        //通过将给定的路径字符串转换为抽象路径名来创建新的File实例
        File F1 = new File("E:\\java.txt");
        //从父路径名字字符串和子路径名字字符串创建新的File实例
        File F2 = new File("E:\\","java.txt");
        //从父抽象路径名和子路径名字字符串创建新的File实例
        File F3 = new File("E:\\");
        File F4 = new File(F3,"java.txt");
        System.out.println(F4);
    }
}
