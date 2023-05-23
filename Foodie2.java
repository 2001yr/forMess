package Multithread;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie2 extends Thread {
    private ArrayBlockingQueue<String>bz;
    public Foodie2(ArrayBlockingQueue<String>bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            try {
               String take = bz.take();
                System.out.println("吃货把" + take + "拿出来吃了");
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
