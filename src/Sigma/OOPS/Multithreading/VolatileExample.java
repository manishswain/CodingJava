package OOPS.Multithreading;

class SharedObj {
    private volatile boolean flag = false;

    public void writeFlagToTrue() {
        try {
            Thread.sleep(1000);
            flag = true;
            System.out.println("Value set to true");
        } catch (Exception ex) {
            Thread.currentThread().interrupt();
        }

    }

    public void readFlag() {
        while (!flag) {
            // Do Nothing
        }
        System.out.println("Value is true now");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedObj obj = new SharedObj();

        Thread t1 = new Thread(() -> obj.writeFlagToTrue());
        Thread t2 = new Thread(() -> obj.readFlag());

        t2.start();
        t1.start();
    }
}
