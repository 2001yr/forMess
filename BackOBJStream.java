package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BackOBJStream {
    //对象反序列化 ObjectInputStream
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\itTiger"));
        Object obj = ois.readObject();
        student s  = (student)obj;
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }
}
