package com.itheima.edu.info.reStudy;

import java.io.File;
import java.io.IOException;

public class Test2OfFile {
    public static void main(String[] args)throws IOException {
        File F1 = new File("E:\\itcat");
        deleteDir(F1);
    }
    //定义deleteDir方法
    private static void deleteDir(File F1){
        //先删除文件夹里所有内容
        //递归 方法在方法体中调用自己
        //遍历这个File对象
        File[]files = F1.listFiles();
        for (File file : files){
            if (file.exists()){
                //如果是文件，直接删除
                file.delete();
            }
            else{
                //如果是文件夹，递归调用自己，将当前遍历到的file对象当做参数传递
                deleteDir(file);
            }
        }
        //参数传递过来的文件夹File对象已经处理完毕，最后可以直删除这个空文件夹
        F1.delete();
    }
}
