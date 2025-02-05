package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MajorityElementLeetcode {

    // Question Number 169
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2, 3, 3, 3, 3, 2 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find a candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify if the candidate is indeed the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return candidate;
    }
}
