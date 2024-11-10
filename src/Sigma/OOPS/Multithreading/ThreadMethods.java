package OOPS.Multithreading;

public class ThreadMethods extends Thread {

    @Override
    public void run() {

        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + " Hello");
            // Thread.yield();
            i++;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods th1 = new ThreadMethods();
        ThreadMethods th2 = new ThreadMethods();
        th1.setDaemon(true);
        th1.start();
        // th2.start();
        Thread.sleep(10);

    }

}
