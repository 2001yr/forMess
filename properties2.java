package IO;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class properties2 {
    //properties作为Map集合的特有方法
    public static void main(String[] args) {
        Properties properties = new Properties();
        //设置键和值，类型都是String，底层调用Hashtable的put方法
        properties.setProperty("110","yy");
        properties.setProperty("111","mm");
        properties.setProperty("112","nn");
        //此处调用了getProperty方法，第八行报警消除
        //此方法通过此属性表中的指定键搜索属性
        System.out.println(properties.getProperty("112"));
        System.out.println(properties);
        //此方法返回一个键集，键对应的值是字符串
        Set<String>name = properties.stringPropertyNames();
        for (String key:name){
           String value =  properties.getProperty(key);
            System.out.println(key + value);
        }

    }

}
