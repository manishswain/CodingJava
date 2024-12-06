package Collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap14 {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();
        String key1 = new String("Akshit");
        String key2 = new String("Akshit");
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        map.put(key1, 90);
        map.put(key2, 92);
        System.out.println(map);

    }
}