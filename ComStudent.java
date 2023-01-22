package com.itheima.edu.info.reStudy;

public class ComStudent implements Comparable<ComStudent>{
    //自定义的ComStudent类实现Comparable接口
    //为何此实现Comparable接口？
    //若要像此处比较类与类对象(ComStudent)之间的关系，则必须实现Comparable接口
    private String name;
    private int age;

    public ComStudent() {
    }

    public ComStudent(String name, int age) {
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
        return "ComparableStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //重写comparable方法
    public int compareTo(ComStudent i){
        //主要条件:按照年龄从小到大排序
         int result = this.age - i.age;
        //次要条件:年龄相同时，按照姓名的字母顺序排序
        result=result==0?this.name.compareTo(i.getName()):result;//三元运算符
        return result;
    }
}
