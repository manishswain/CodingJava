package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("List" + i);
        }
        System.out.println(Arrays.toString(list.toArray(new String[0])));
    }
}
