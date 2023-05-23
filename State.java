package Multithread;

public class State {
    public static void main(String[] args)throws InterruptedException {
        Thread thread = new Thread(()-> {
            //thread1和main线程
            System.out.println("2.执行Thread.start后Thread的状态" + Thread.currentThread().getState());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4.执行Thread.sleep的状态" + Thread.currentThread().getState());
        });
        System.out.println("1.还没有start()时的线程状态" + thread.getState());
        //100ms后thread线程开始运行
        thread.start();
        //在50ms时Thread还在休眠,因为thread1需要休眠100ms
        Thread.sleep(50);
        //Thread被迫重新进行休眠
        System.out.println("3.执行Thread.sleep时的状态" +thread.getState());
        //thread1和main线程主动休眠150秒，此时thread已经执行完毕
        Thread.sleep(100);
        //100ms后执行完毕
        System.out.println("5.执行完毕后，线程的状态" + thread.getState());
    }
}
