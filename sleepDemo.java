package Multithread;

import java.io.*;

public class sleepDemo {
    public static void main(String[] args)throws IOException {
      //  InputStreamReader inputStreamReader= new InputStreamReader(new FileInputStream("F:\\itTiger.txt"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("F:\\itTiger.txt"));
        Sleep s = new Sleep();
       for (int i = 0; i < 50; i++) {
           //实际打印50个
           s.setName("正在执行");
           outputStreamWriter.write(s.getName()+i);
           outputStreamWriter.write("\r\n");
       }
            s.start();
        outputStreamWriter.close();

    }

}
