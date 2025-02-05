package Practice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);

        list.sort((a, b) -> a - b);
        System.out.println(list);
    }
}