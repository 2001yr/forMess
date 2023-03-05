package com.itheima.edu.info.reStudy;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("林琴下");
        list.add("张一博");
        list.add("王祖贤");
        list.add("张无忌");
        list.add("刘岩");
        //把所有姓“张”的储存到另一个集合
        ArrayList<String>zhangList = new ArrayList<>();
                 //遍历集合，拿到所有元素后进行判断
        for (String s : list){
            if (s.startsWith("张")){
                zhangList.add(s);
            }
        }
        //把”张“开头的集合中长度为3的元素储存到一个新的集合
        ArrayList<String>zhangsanList = new ArrayList<>();
        for (String s :zhangList){
            if(s.length()==3){
                zhangsanList.add(s);
                //遍历一遍上面的集合
            }
        }
        for (String s : zhangsanList){
            System.out.println(s);
        }
        System.out.println("----------------------------");
        //long count =  list.stream().filter(s -> s.startsWith("王")).count();计最后的总数
        //System.out.println(count);
        //list.stream().limit(2).forEach(System.out::println);取用前两个
        //list.stream().skip(0).forEach(System.out::println);跳过第一个
       /*用Stream流进行优化：*/
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);
    }
}
