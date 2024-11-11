package OOPS.Multithreading;

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread consumeThread = new Thread(new Consumer(resource), "Consumer");
        Thread producerThread = new Thread(new Producer(resource), "Producer");

        consumeThread.start();
        producerThread.start();
    }
}

class SharedResource {

    private int data;

    private boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("Produced" + data);
        hasData = true;
        notify();

    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        hasData = false;
        System.out.println("Consumed" + data);
        notify();
        return data;
    }
}

class Producer implements Runnable {

    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            resource.produce(i);
        }
    }

}

class Consumer implements Runnable {

    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            resource.consume();
        }
    }

}
