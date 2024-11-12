package OOPS.Multithreading;

public class ThreadPoolingNonExecutorExample {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            threads[i - 1] = new Thread(() -> {
                System.out.println(factorial(finalI));
            });
            threads[i - 1].start();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken is " + (endTime - startTime));

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
