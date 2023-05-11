package Multithread;

import java.io.IOException;
import java.util.concurrent.Callable;

public class Sleep extends Thread {
    public  Sleep(){ //空参
}
    public  Sleep(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i +getName());
        }
    }

    //static void sleep(long millis)
    //使当前正在执行的线程停留毫秒数

}
