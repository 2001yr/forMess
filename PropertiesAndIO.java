package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesAndIO {
    public static void main(String[] args)throws IOException {
        //Properties和IO流相结合的方法
        //从输入字符流读取属性列表 void load(Reader reader)
        //myLoad();
        //将此属性列表写入Properties中，以适用load(Reader)方法的格式写入输出字符流
        myStore();
    }
    private static void myLoad()throws IOException{
        Properties prop = new Properties();
        FileReader fr = new FileReader("F:\\itTiger.txt");
        //(Reader reader)
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
    private static void myStore()throws IOException{
        Properties prop = new Properties();
        prop.setProperty("001","a");
        prop.setProperty("002","b");
        prop.setProperty("003","c");
        FileWriter fw =new FileWriter("F:\\itTiger.txt");
        //comments:注释，一般为null
        prop.store(fw,null);
        fw.close();
    }
}
