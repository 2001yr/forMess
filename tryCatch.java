package com.itheima.edu.info.reStudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class tryCatch {
    public static void main(String[] args){
        FileOutputStream fos = null;
        try{   //可能出现的代码
            fos = new FileOutputStream("myFavorate.txt");
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
        }catch (IOException e){  //异常类名，命名对象
          e.printStackTrace();
        }finally {  //执行所有操作
            if(fos != null){  //如果不为空，说明已经正确输入
                try {
                    fos.close();//则正常关流
                }catch (IOException e){ //否则抓住异常
                    e.printStackTrace();
                }

            }

        }
    }
}
