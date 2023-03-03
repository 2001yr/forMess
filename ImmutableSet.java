package com.itheima.edu.info.reStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ImmutableSet {
    public static void main(String[] args) {
    }
    private static void method1(){
        //此方法(.ofEntries)先把键值对封装为一个Entry对象，再把这个对象添加到集合中
        Map<String,String>map = Map.ofEntries(
                Map.entry("江苏","zhangsan"),
                Map.entry("南极", "xiaoxia"));
        System.out.println(map);
    }
    private static void method2(){
        //此方法(.of)可以直接储存键值对kv
        Map<String,String>map = Map.of("南极","熊","北极","虾");
        System.out.println(map);
    }
    private static void method3(){
        List<String>list = List.of("A","A","A","C","C");
        System.out.println(list);
        //集合的批量添加
        ArrayList<String>arrayList =new ArrayList<String>(List.of("a","b","c","d"));
        System.out.println(arrayList);
    }

}
