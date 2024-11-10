package OOPS.Multithreading;

public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }
}

class MyThread extends Thread {

    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }

}

class Counter {

    private int count = 0;

    public void increment() {
        synchronized (this) {
            this.count++;
        }

    }

    public int getCount() {
        return this.count;
    }
}
