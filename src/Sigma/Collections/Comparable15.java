package Collections;

import java.util.ArrayList;
import java.util.List;

public class Comparable15 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Bob", 3.7));
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Akshit", 3.9));
        list.sort(null);
        System.out.println(list);
    }

}