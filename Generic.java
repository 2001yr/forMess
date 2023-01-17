package com.itheima.edu.info.reStudy;

public class Generic<T> {  //修饰符 class 类名<类型> { }
    //定义一个泛型类
    private T t;  //泛型为T
    private int num;
    //正常有参无参构造
    public Generic() {
    }

    public Generic(T t, int num) {
        this.t = t;
        this.num = num;
    }
    //正常的getter setter方法
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    //正常的toString
    @Override
    public String toString() {
        return "Generic{" +
                "t=" + t +
                ", num=" + num +
                '}';
    }
}

