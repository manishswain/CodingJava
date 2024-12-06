package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache11<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache11(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache11<String, Integer> cache = new LRUCache11<>(3);
        cache.put("man", 5);
        cache.put("can", 2);
        cache.put("lan", 6);
        cache.get("man");

        cache.put("tan", 10);

        cache.get("lan");

        cache.put("ian", 13);

        System.out.println(cache);

    }

}
