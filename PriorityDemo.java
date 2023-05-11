package Multithread;

import java.util.concurrent.FutureTask;

public class PriorityDemo {
    public static void main(String[] args) {
        priority p = new priority();
        //利用FutureTask将对象p加入
        FutureTask<String>f = new FutureTask<>(p);
        Thread t1 = new Thread(f);
        t1.setName("fly");
        //设置优先级
        t1.setPriority(5);//数字越大优先级越大,但优先级相近时(eg:5,6)优先级并不能绝对生效，表明程序的优先级只是优先级高的线程分配时间片的数量要高于优先级低的
        t1.start();
        priority p2 = new priority();
        FutureTask<String>f2 = new FutureTask<>(p2);
        Thread t2 = new Thread(f2);
        t2.setName("swim");
        t2.start();
       // System.out.println(t2.getPriority());  5
        t2.setPriority(6);


    }
}
