package IO;

import java.io.*;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args)throws IOException,ClassNotFoundException {
        student3 s = new student3("Alex",25);
        student3 s2 = new student3("Alen",22);
        student3 s3 = new student3("Rale",18);
        //序列化
        ArrayList<student3>arrayList = new ArrayList<>();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("F:\\itTiger"));
       arrayList.add(s);
       arrayList.add(s2);
       arrayList.add(s3);
       objectOutputStream.writeObject(arrayList);
       objectOutputStream.close();
       //反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("F:\\itTiger"));
      Object o = objectInputStream.readObject();
      student3 student3 = (student3)o;
        System.out.println(student3.getName() + "," + student3.getAge());

    }
}
