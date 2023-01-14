package com.itheima.edu.info.reStudy;

public class AutoNumber {
    public static void main(String[] args) {
        int a = 1;
        a = a++;
        System.out.println(a);
        //1

        int b = 1;
        b = ++b;
        System.out.println(b);
        //2

        int c = 1;
        c = c++;
        System.out.println(c++);
        //1

        int d = 1;
        d = d++;
        System.out.println(++d);
        //2

        int e = 1;
        e = ++e;
        System.out.println(++e);
        //3

        int f = 1;
        f = ++f;
        System.out.println(f++);
        //2
    }
}
