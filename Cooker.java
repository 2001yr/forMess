package Multithread;

import javax.swing.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread{
    //厨师
    //1.判断桌子上有没有汉堡  ---有->等待 ---无->生产
    //2.如果有---叫醒吃货开吃

    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){ //没有汉堡
                    break;
                }else {
                    if (Desk.flag){
                        //生产
                        System.out.println("厨师正在生产汉堡");
                        Desk.flag = true;
                        Desk.lock.notifyAll();
                    }else { //若没有，则进行等待
                        try {
                            Desk.lock.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }
}
