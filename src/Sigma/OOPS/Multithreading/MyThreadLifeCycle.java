package OOPS.Multithreading;

public class MyThreadLifeCycle extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadLifeCycle t = new MyThreadLifeCycle();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(200);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());

    }

}
