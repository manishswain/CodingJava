package OOPS.Multithreading;

public class ThreadClass extends Thread {

    public static void main(String[] args) {

        ThreadClass world = new ThreadClass();
        world.start();

        Planet planet = new Planet();
        planet.start();

        for (;;) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}

class Planet extends Thread {

    @Override
    public void run() {
        for (;;) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
