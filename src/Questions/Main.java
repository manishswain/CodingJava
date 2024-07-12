package Questions;

public class Main extends Test {
    public static void main(String[] args) {
        System.out.println("QWERTY");
        Main m = new Main();
        m.get();
    }

    public void set() {
    }

    @Override
    public void get() {
        System.out.println("Abstarct  test ");

    }
}

abstract class Test {
    public abstract void get();
}
