package Multithread;

import java.util.concurrent.ArrayBlockingQueue;

public class EatDemo2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String>bz = new ArrayBlockingQueue<>(1);
        Cooker2 cooker2 = new Cooker2(bz);
        Foodie2 foodie2 = new Foodie2(bz);
        cooker2.start();
        foodie2.start();

    }
}
