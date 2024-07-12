package Questions;

class Random implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }

    }

}

class Runner {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread obj = new Thread(new Random());
            obj.start();
        }
    }
}
