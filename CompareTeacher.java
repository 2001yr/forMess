package com.itheima.edu.info.reStudy;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareTeacher {
    public static void main(String[] args) {
        //Comparator就是创建集合时将方法带参构造,重写在了集合里
        TreeSet<ComTeacher>treeSet =new TreeSet<>(new Comparator<ComTeacher>() {
            @Override
            public int compare(ComTeacher o1, ComTeacher o2) {
                //o1是当前要存入的那个元素
                //o2是已经存入到集合的元素

                //主要条件
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });//这样总体一个集合才算定义完毕
            ComTeacher t1 = new ComTeacher("张三",23);
            ComTeacher t2 = new ComTeacher("李四",24);
            ComTeacher t3 = new ComTeacher("王五",25);
            treeSet.add(t1);
            treeSet.add(t2);
            treeSet.add(t3);
            for (ComTeacher comTeacher:treeSet){
                System.out.println(comTeacher);

            }

        }
    }
//比较器排序Comparator会多一个类
//自然排序comparable需要改变存储对象类的接口
//当二者做选择时，倾向选择比较器排序