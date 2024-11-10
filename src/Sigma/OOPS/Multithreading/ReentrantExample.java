package OOPS.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("outerMethod");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        lock.lock();
        try {
            System.out.println("innerMethod");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample re = new ReentrantExample();
        re.outerMethod();
    }
}
