package OOPS.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private int counter = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock(true);

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();

    public int getCount() {
        return this.counter;
    }

    public void writeCounter() {
        writeLock.lock();
        try {
            this.counter++;
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        } finally {
            writeLock.unlock();
        }
    }

    public int readCounter() {
        readLock.lock();
        try {
            return getCount();
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockExample example = new ReadWriteLockExample();

        Runnable read = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(
                            Thread.currentThread().getName() + " value of counter is " + example.readCounter());
                }
            }

        };

        Runnable write = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " updating counter");
                    example.writeCounter();
                }
            }

        };

        Thread writeThread = new Thread(write, "Write Thread");
        Thread readThread1 = new Thread(read, "Read Thread1");
        Thread readThread2 = new Thread(read, "Read Thread2");
        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final Count" + example.getCount());
    }
}
