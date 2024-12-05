package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.addLast(5);
        list.addFirst(3);
        list.getFirst();
        list.getLast();
        list.removeIf(x -> x % 2 == 0);
        System.out.println(list);
    }
}
