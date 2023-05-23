package Multithread;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker2 extends Thread {
    private ArrayBlockingQueue<String>bz;
    public Cooker2(ArrayBlockingQueue<String>bz){
       this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            try {
                bz.put("汉堡包");
                System.out.println("厨师刚刚放入了一个汉堡包");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
