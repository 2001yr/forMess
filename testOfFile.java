package com.itheima.edu.info.reStudy;

import java.io.File;
import java.io.IOException;

public class testOfFile {
    public static void main(String[] args)throws IOException {
        File file = new File("E:\\itdog");
        if (!file.exists()){//如果不存在，就创建
            file.mkdirs();
        }
        File newFile = new File("E:\\itdog");
        newFile.createNewFile();
    }
}
