package com.itheima.edu.info.reStudy;

import java.util.TreeSet;

public class CompareStudent {
    public static void main(String[] args) {
        TreeSet<ComStudent>treeSet = new TreeSet<>();
        ComStudent s1 = new ComStudent("张三",25);
        ComStudent s2 = new ComStudent("李四",31);
        ComStudent s3 = new ComStudent("王五",60);
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        //遍历集合
        for(ComStudent s :treeSet){
            System.out.println(s);
        }
    }
}
