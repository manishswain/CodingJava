package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>(5, 6);

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.capacity());
        list.add(1);
        System.out.println(list.capacity());

        // All methods are there same as List interface
        // Thread Safety is there in vector

        // ArrayList not thread safe
        List<Integer> arrList = new ArrayList<>(3);
        Thread th1 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                arrList.add(i);
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                arrList.add(i);
            }
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e) {
        }
        System.out.println(arrList.size());

        // Vector thread safe
        Vector<Integer> vecList = new Vector<>(3);
        Thread th3 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                vecList.add(i);
            }
        });

        Thread th4 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                vecList.add(i);
            }
        });

        th3.start();
        th4.start();

        try {
            th3.join();
            th4.join();
        } catch (Exception e) {
        }
        System.out.println(vecList.size());
    }
}
