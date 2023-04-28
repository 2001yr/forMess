package IO;

import java.io.Serializable;

public class student3 implements Serializable {
    private String name;
    private int age;

    public student3(String name, int age) {
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

    public student3() {
    }

    @Override
    public String toString() {
        return "student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
