package IO;

import java.io.*;

public interface OBJStream {
    public static void main(String[] args)throws IOException {
       //OutputStreamWriter outputStreamWriter = new ObjectOutputStream(OutputStream out);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\itTiger"));
        student i = new student();//此时空参构造已被调用
        student o = new student("杨睿",21);
        //将指定的对象写入ObjectOutputStream
        oos.writeObject(o);
        oos.close();
        //一个接口要想被序列化，就必须实现Serializable接口
        //Serializable是一个标记接口，不需要任何方法
    }
}
