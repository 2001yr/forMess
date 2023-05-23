package Multithread;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
    //支持阻塞插入方法:当队列满时，队列会阻塞插入元素的线程，等到队列不满
    //支持阻塞移除方法:当队列空时，获取元素的线程会被阻塞，等到队列非空

    /*------常见的BlockingQueue----------
    ArrayBlockingQueue：底层是数组，有界
    LinkBlockingQueue：底层是链表，界为int的最大值
    -------BlockingQueue的核心方法---------
    put(anObject) ：将参数放入队列，如果放不进去会阻塞
    take()：取出第一个数据，取不到会阻塞
     */
    public static void main(String[] args)throws Exception {
        //创造阻塞队列的对象，容量为1
        ArrayBlockingQueue<String>arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        //存元素
        arrayBlockingQueue.put("汉堡");
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());//取不到，阻塞
        //阻塞无法打印
        System.out.println("程序结束了");
    }
}
