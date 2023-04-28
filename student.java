package IO;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class student implements Serializable {
    //想要序列化流，必须使用Serializable接口
    public student() {
        //此时空参构造已被调用
    }

    /*序列化流,就是将对象保存到磁盘中，或在网络中传输对象，使用一个字节序列表示一个对象，该字节包括
        -----------------------------------------
        对象的类型，对象的数据，对象中存储的属性信息
        */
    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ForIO2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
