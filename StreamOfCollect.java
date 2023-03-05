package com.itheima.edu.info.reStudy;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamOfCollect {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("李明");
        list.add("张仪");
        list.add("李暗");
        list.add("李明响");
        //过滤出长度为2的流
      Stream<String>streamList = list.stream().filter(s -> s.length() == 2);
        //把使用stream流操作完毕的数据收集到list集合中遍历
        List<String>stringList = streamList.collect(Collectors.toList());
        for (String name:stringList){
            System.out.println(name);
                 }
        //创建set集合
        Set<Integer>set = new HashSet<Integer>();
        set.add(20);
        set.add(30);
        set.add(15);
        set.add(18);
        set.add(25);
        //过滤大于20的流
      Stream<Integer> streamSet =  set.stream().filter(integer -> integer>20);
        //把使用stream流操作完毕的数据收集到set集合中遍历
     Set<Integer>setStream = streamSet.collect(Collectors.toSet());
     for (Integer age : setStream){
         System.out.println(setStream);
                }
        //定义一个字符串数组，每个字符串数据由姓名和年龄组成
        String[]array = {"张天爱，18","小敏霞，15","李明，25","咩咩，19"};
        //得到字符串中年龄大于18的流
        Stream<String>streamArray = Stream.of(array).filter(s -> Integer.parseInt(s.split("，")[1]) > 18);
        //把使用stream流操作完毕的数据收集到Map集合中遍历，字符串中的姓名做键，年龄做值
        Map<String,Integer> map = streamArray.collect(Collectors.toMap(s -> s.split("，")[0],s -> Integer.parseInt(s.split("，")[1])));
         Set<String>keySet = map.keySet();
         for (String key : keySet){
             Integer values = map.get(key);
             System.out.println(key + "," + values);
              }
        }
    }