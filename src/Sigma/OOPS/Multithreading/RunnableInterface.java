package OOPS.Multithreading;

public class RunnableInterface implements Runnable {

    public static void main(String[] args) {

        RunnableInterface i = new RunnableInterface();
        Thread t1 = new Thread(i);
        t1.start();

        RandomRunnable j = new RandomRunnable();
        Thread t2 = new Thread(j);
        t2.start();

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

class RandomRunnable implements Runnable {

    @Override
    public void run() {
        for (;;) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
