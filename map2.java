package com.itheima.edu.info.reStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map2 {
    public static void main(String[] args) {
        //此代码主义将键值对看为一个整体，通过整个键值对去获取所对应的值
        Map<String,String>map =new HashMap<String,String>();
        map.put("张", "小明");
        map.put("王", "建设");
        map.put("李", "明天");
        //获取所有键值对对象的集合
        Set<Map.Entry<String,String>>entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String,String>me:entrySet){
            //根据键值对对象获取键和值
            String min = me.getValue();
            String xin = me.getKey();
            System.out.println(xin +"..." + min);
        }

    }
}
