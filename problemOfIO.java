package com.itheima.edu.info.reStudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class problemOfIO {
    public static void main(String[] args)throws IOException {
        //追加文件----如果第二个参数为true，则将写入的文件的末尾而不是开头
        FileOutputStream fos = new FileOutputStream("myFavorate.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
            fos.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行

        }
        fos.close();
    }
}
