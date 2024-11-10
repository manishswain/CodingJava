package OOPS.Multithreading;

public class BankAccountSynchronize {

    public static void main(String[] args) {
        BankAccountSynchronize sbi = new BankAccountSynchronize();
        Runnable run = () -> {
            sbi.withdraw(50);
        };
        Thread t1 = new Thread(run, "Thread 1");
        Thread t2 = new Thread(run, "Thread 2");
        t1.start();
        t2.start();
    }

    private int balance = 100;

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withraw.Remaining Balance " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + "Insufficient Balance");
        }
    }
}