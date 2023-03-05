package com.itheima.edu.info.reStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestOfActor {
    public static void main(String[] args) {
        ArrayList<String>manlist = new ArrayList<>();
        manlist.add("周润发");
        manlist.add("成龙");
        manlist.add("刘德华");
        manlist.add("吴京");
        manlist.add("周星驰");
        manlist.add("李连杰");
        ArrayList<String>womanList = new ArrayList<>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        //男演员只要名字为三个字的前三人
        Stream<String>nm = manlist.stream().filter(s -> s.length() ==3).limit(3);
        //女演员只要姓林的，并且不要第一个
        Stream<String>nw = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
        //把过滤后的男演员和女演员合并到一起
        Stream<String>stream = Stream.concat(nw, nm);
        //把操作后的元素作为构造方法的参数创造对象，遍历数据
        stream.map(Actor::new).forEach(System.out::println);

    }
}
