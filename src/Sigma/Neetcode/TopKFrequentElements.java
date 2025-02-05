package Neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] res = topKFrequent(arr, k);

        System.out.println(Arrays.toString(res));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k)
            return nums;

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Queue<Integer> pq = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b));

        for (int n : map.keySet()) {
            pq.add(n);

            if (pq.size() > k) {
                pq.poll();
            }

        }
        return pq.stream().mapToInt(i -> i).toArray();
    }
}
