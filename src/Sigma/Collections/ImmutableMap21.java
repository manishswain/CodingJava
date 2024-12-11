package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap21 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
        // map2.put("C", 3); throws exception
        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89);
        // map3.put("Akshit", 88); throws exception
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 99), Map.entry("Vivek", 99));

    }
}