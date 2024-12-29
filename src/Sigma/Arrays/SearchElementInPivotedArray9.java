package Arrays;

public class SearchElementInPivotedArray9 {
    public static void main(String[] args) {
        // Initialize the array and the target element to search for
        int[] nums = { 5, 6, 7, 0, 1, 2, 4, };
        int target = 7;

        // Call the search function and store the result
        int res = searchSelf(nums, target);

        // Print the result
        System.out.println(res);
    }

    private static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the middle element is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which part of the array is sorted
            if (nums[left] <= nums[mid]) {
                // Left part is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    // Target is in the left part
                    right = mid - 1;
                } else {
                    // Target is in the right part
                    left = mid + 1;
                }
            } else {
                // Right part is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    // Target is in the right part
                    left = mid + 1;
                } else {
                    // Target is in the left part
                    right = mid - 1;
                }
            }
        }
        // Target not found
        return -1;
    }

    private static int searchSelf(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check on which side the target is present
            // For left side
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target <= nums[end] && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}