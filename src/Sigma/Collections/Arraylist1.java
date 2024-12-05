package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(3);
        System.out.println(list.size());
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);
        list.addFirst(4);

        System.out.println(list.remove((Integer) 2));
        System.out.println(list);
    }
}
