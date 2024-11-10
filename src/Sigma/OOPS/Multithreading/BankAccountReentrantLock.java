package OOPS.Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountReentrantLock {

    public static void main(String[] args) {
        BankAccountReentrantLock sbi = new BankAccountReentrantLock();
        Runnable run = () -> {
            sbi.withdraw(50);
        };
        Thread t1 = new Thread(run, "Thread 1");
        Thread t2 = new Thread(run, "Thread 2");
        t1.start();
        t2.start();
    }

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {

                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(
                                Thread.currentThread().getName() + " completed withraw.Remaining Balance " + balance);
                    } catch (InterruptedException e) {
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + "Insufficient Balance");
                }
            } else {
                System.out.println(
                        Thread.currentThread().getName() + " Couldn't get access to lock .Will try again later");
            }

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Thread Interupted");
        }
    }
}