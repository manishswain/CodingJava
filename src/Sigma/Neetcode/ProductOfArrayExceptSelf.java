package Neetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = { -1, 1, 0, -3, 3 };
        int[] res = productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int[] suffixArr = new int[nums.length];
        prefixArr[0] = 1;
        suffixArr[nums.length - 1] = 1;

        // Auxillary Array for prefix
        for (int i = 1; i < nums.length; i++) {
            prefixArr[i] = nums[i - 1] * prefixArr[i - 1];
        }

        // Auxillary Array for prefix
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixArr[i] = nums[i + 1] * suffixArr[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefixArr[i] * suffixArr[i];
        }
        return nums;
    }
}
