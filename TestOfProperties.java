package IO;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class TestOfProperties {
    public static void main(String[] args)throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("CCC");
        properties.load(fileReader);
        fileReader.close();
       String name =  properties.getProperty("name");
       int age = Integer.parseInt(properties.getProperty("age"));
       student s = new student();
       //创建序列化对象，将学生序列化写道本地文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CCC"));
        oos.writeObject(s);
        oos.close();
    }
}
