package com.itheima.edu.info.reStudy;

import java.io.File;

public class file2 {
    public static void main(String[] args) {
        //绝对路径，是一个完整的路径，从盘符开始
        File F1 = new File("E:\\java.txt");
        //相对路径，是一个简化的路径，相对于当前项目下的路径
        File F2 = new File("a.txt");
        File F3 = new File("模块名\\a.txt");
    }
}
