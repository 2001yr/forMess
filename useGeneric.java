package com.itheima.edu.info.reStudy;

public class useGeneric {
    public static void main(String[] args) {
        Generic<String>use = new Generic<>();
        use.setNum(5);
        use.setT("hello World!");
        //也可不写泛型
        Generic use2 =new Generic();
        use2.setT(10);
        System.out.println(use);
        System.out.println(use2);
    }

}
