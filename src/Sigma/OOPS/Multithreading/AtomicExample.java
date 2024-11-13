package OOPS.Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) {
        Counter1 counter = new Counter1();
        MyThread1 t1 = new MyThread1(counter);
        MyThread1 t2 = new MyThread1(counter);
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

class MyThread1 extends Thread {

    private Counter1 counter;

    public MyThread1(Counter1 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

}

class Counter1 {

    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
