package IO;

import java.io.*;

public class serialVersionUID {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        //序列化一个对象后，假如我们修改了对象所属的类文件，读数据时会怎样？
        //出现问题，会抛出InvalidClassException异常
        //如何解决？重新序列化，给对象所属的类加一个serialVersionUID
        //如果一个对象中的某个值不想被序列化，又该怎样呢？
        //给该成员加transient关键词修饰，该关键词标记的成员变量是不参与序列化的
        Write();//序列化
        read();//反序列化
    }
    private static void Write()throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\itTiger"));
        student2 student2 = new student2("杨睿",18);
        oos.writeObject(student2);
        oos.close();
    }
    private static void read()throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\itTiger"));
        Object o = ois.readObject();
        student2 s = (student2)o;
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();


    }


}
