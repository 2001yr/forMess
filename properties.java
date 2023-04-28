package IO;
import java.util.Properties;
import java.util.Set;

public class properties {
    //properties作为Map集合的使用
    //可以保存到流中或流中加载
    //属性列表中的每个键及其对应的值都是一个字符串
    public static void main(String[] args) {
        //创造集合对象
        //Properties<String,String>pro = new Properties()
        Properties prop = new Properties(); //-----此处可能会报错，是提醒后续使用get()方法，调用后报错消除
        //存储元素
        prop.put("Alex","18");//Ctrl + D 向下复制一行
        prop.put("Miry","19");
        prop.put("Marry","20");
        //遍历集合，得到所有key
        Set<Object>keySet = prop.keySet();
        for (Object key:keySet){
            //通过遍历得到值
          Object value = prop.get(key);
            System.out.println(key + "," + value);

        }
    }
}
