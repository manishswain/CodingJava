package Test;

import java.util.Arrays;
import java.util.List;

public class Solution30 {
    public static void main(String[] args) {
        String str = "qwert,qwe, asddf,  dfsdfdsf,   fsfsdf";
        List<String> items = Arrays.asList(str.split("\\s*,\\s*"));
        String miscTypeString = String.join(",", str);
        System.out.println(miscTypeString);
        System.out.println(items.toString());
    }
}
