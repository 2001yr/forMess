package com.itheima.edu.info.reStudy;

public class TreeMapStudent {
    private String name;
    private int age;

    public TreeMapStudent() {
    }

    public TreeMapStudent(String name, int age) {
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
        return "TreeMapStudent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public int compareTo(TreeMapStudent o){
        //result大于1时时按照升序排序
        //按照年龄进行排序
        int result = o.getAge() - this.getAge();
        //次要条件按照姓名排序
        result = result == 0? o.getName().compareTo(this.getName()) : result;
        return result;
    }
}
