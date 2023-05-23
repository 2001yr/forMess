package Multithread;

public class EatDemo {
    public static void main(String[] args) {
        Foodie foodie = new Foodie();
        Cooker cooker = new Cooker();


        foodie.start();
        cooker.start();
    }
}
