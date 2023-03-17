package com.itheima.edu.info.reStudy;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.File;
import java.util.HashMap;

public class test3OfFile {
    public static void main(String[] args) {
        //同济一个文件夹中每组文件的个数并打印
        File F1 = new File("E:\\itcat");
        HashMap<String,Integer>hm = new HashMap<>();
        getCount(hm,F1);

    }
    private static void getCount(HashMap<String,Integer>hm,File file){
        //遍历File对象
        File[]files = file.listFiles();
        for (File f : files){
            if(f.isFile());
           String FileName = f.getName();
           String[] FileNameArr = FileName.split("\\.");
           

        }
    }
}
