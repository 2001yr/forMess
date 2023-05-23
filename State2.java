package Multithread;

public class State2 {
    public static void main(String[] args)throws InterruptedException {
        //定义对象，用来加锁
        Object obj = new Object();
        Thread thread1 = new Thread(()->{
            System.out.println("2.执行start之后，线程的状态" + Thread.currentThread().getState());
           synchronized (obj){
               try {
                   Thread.sleep(100);
                   //100ms之后，释放obj锁对象
                   obj.wait();
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
            System.out.println("4.被notify唤醒后，线程的状态" + Thread.currentThread().getState());
        });
        System.out.println("1.还未start时线程的状态" + thread1.getState());
        thread1.start();
        Thread.sleep(150);
        //thread1在100ms时进入wait状态，150ms绝对能获取到其状态
        System.out.println("3.执行wait时，线程的状态为" + thread1.getState());
        //声明另一个线程，并进行解锁
        new Thread(()->{
           synchronized (obj){
               obj.notify();
           }
        }).start();
        //让主线程休眠10ms等待thread1的线程能够苏醒
        Thread.sleep(10);
        System.out.println("5.线程进行完毕，线程的状态为" + thread1.getState());
    }
}
