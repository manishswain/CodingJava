package Questions;

public class Recursion {
    public static void main(String[] args) {
        foo(3);
        System.out.println("Hell");
    }

    private static void foo(int i) {
        if (i < 1) {
            return;
        } else
            foo(i - 1);
        System.out.println("Hello World" + i);
    }
}