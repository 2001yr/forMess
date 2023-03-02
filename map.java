package com.itheima.edu.info.reStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<String,String>map = new HashMap<String,String>(); //标准定义map集合
        map.put("itheima001" ,"张曼玉");
        map.put("itheima002", "杨睿");
        map.put("itheima003", "林琴");
        //获取所有键的聚合
        Set<String>keySet = map.keySet();
        //遍历键的集合，获取到每一个键
        for (String key : keySet){
            //根据键去找值
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

        System.out.println(map);
    }
}
