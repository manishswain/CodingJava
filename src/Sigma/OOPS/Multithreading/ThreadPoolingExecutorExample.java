package OOPS.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolingExecutorExample {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                System.out.println(factorial(finalI));
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        System.out.println("Time Taken is " + (System.currentTimeMillis() - startTime));

    }

    private static int factorial(int num) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }
}
