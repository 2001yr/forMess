package Multithread;

public class Foodie extends Thread {
    //1.判断桌子上有没有汉堡包 有就开吃，没有就等待
    //2.吃完之后，桌上就没有汉堡了，此时叫醒厨师进行生产，汉堡数量-1

    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }else {
                    if (Desk.flag){
                        System.out.println("吃货正在吃汉堡");
                        Desk.flag = false;
                        Desk.lock.notifyAll();
                        Desk.count--;  //循环直到吃完为止(Desk.count==0)
                    }else {
                        //没有就等待
                        try {
                            Desk.lock.wait();//导致线程等待
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
