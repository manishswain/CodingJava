package Neetcode;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class FirstMissingPositive {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 0 };
        System.out.println(firstMissingPositive(nums));

    }

    private static int firstMissingPositive(int[] nums) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i : nums) {
            if (i > 0) {
                set.add(i);
            }
        }
        int start = 1;
        for (int i = 0; i < set.size(); i++) {
            Iterator<Integer> itr = set.iterator();
            while (itr.hasNext()) {
                if (itr.next() == start) {
                    start++;
                } else {
                    return start;
                }
            }
        }
        return start;
    }
}
