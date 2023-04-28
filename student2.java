package IO;

import java.io.Serializable;

public class student2 implements Serializable {
    //实现Serializable接口进行序列化
    //在不想被序列化的对象前加上transient
private String name;
private transient int age;

    public student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public student2() {
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
        return "student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
