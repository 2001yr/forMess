package IO;

import java.io.*;

public class ForIO1 {
    public static void main(String[] args)throws IOException {
        //input output 转换流
        //outputStreamWriter输出流
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("F:\\itTiger.txt"));
        outputStreamWriter.write("iso");
        outputStreamWriter.close();
        //InputStreamReader输入流
        //使用指定的语言去读取
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("F:\\itTiger.txt"),"GBK");
        //一次读取一个字节
        //读取后获得写入后的数据，配合打印
        int ch;
        while ((ch = inputStreamReader.read())!=-1){
            System.out.print((char)ch);
        }
                }
}
