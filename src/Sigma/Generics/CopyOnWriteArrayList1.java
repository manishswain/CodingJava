package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {
    public static void main(String[] args) {
        // Issue with arrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i : list) {
            System.out.println(i);
            if (i == 2) {
                // list.add(4);
                System.out.println("4 added");
            }
        }
        System.out.println(list);

        // Issue with CopyOnWriteArrayList1
        List<Integer> newList = new CopyOnWriteArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);

        for (int i : list) {
            System.out.println(i);
            if (i == 2) {
                newList.add(4);
                System.out.println("4 added");
            }
        }
        System.out.println(newList);

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    for (int i : arr) {
                        System.out.println(i);
                        Thread.sleep(100);
                    }
                }
            } catch (Exception e) {
            }

        });

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(200);
                arr.add(5);
                System.out.println("Element added");

                Thread.sleep(200);
                arr.remove(3);
                System.out.println("Element Deleted");

            } catch (Exception e) {
            }

        });

        readerThread.start();
        writerThread.start();

        try {
            readerThread.join();
            writerThread.join();
        } catch (Exception e) {
        }
        System.out.println(arr);

    }
}
