package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void modify(int[] arr, List<Integer> list) {
        arr[0] = 10;
        list.add(10);
        arr = new int[] { 1, 2, 3 };
        list = new ArrayList<>(Arrays.asList(1, 2, 3));
    }

    public static void main(String[] args) {
        T t = new T();
        t.start();
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2); // false (different references)
        System.out.println(s1.equals(s2)); // true (same content)
    }
}

class T extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "wow");
    }
}

class A {
    static {
        System.out.println("A Static");
    }

    {
        System.out.println("A NStatic");
    }

    public A() {
        System.out.println("A Cons");
    }

}

class B extends A {
    static {
        System.out.println("B Static");
    }

    {
        System.out.println("B NStatic");
    }

    public B() {
        System.out.println("B Cons");
    }

}
