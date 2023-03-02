package com.itheima.edu.info.reStudy;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        //创建TreeMap对象
        TreeMap<TreeMapStudent,String>treeMap = new TreeMap<>();
        //创建学生对象
        TreeMapStudent T1 = new TreeMapStudent("小花",23);
        TreeMapStudent T2 = new TreeMapStudent("小五",19);
        TreeMapStudent T3 = new TreeMapStudent("珍妮",2);
        //添加到集合中去
        treeMap.put(T1, "上海");
        treeMap.put(T2, "家中");
        treeMap.put(T3, "家中");
        //遍历集合，打印信息
        treeMap.forEach((TreeMapStudent key,String value)->{
            System.out.println(key + "......" + value);
        }
        );
    }
}
