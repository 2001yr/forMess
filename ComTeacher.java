package com.itheima.edu.info.reStudy;

public class ComTeacher {
    private String name;
    private int age;

    public ComTeacher() {
    }

    public ComTeacher(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComTeacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
