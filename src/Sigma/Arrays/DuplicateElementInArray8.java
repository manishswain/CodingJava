package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray8 {
    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4, 1 };
        boolean res = findDuplicate(nums);
        System.out.println(res);
    }

    private static boolean findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
