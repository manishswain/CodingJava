package Arrays;

public class TrappingRainWater7 {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 0, 6, 3, 2, 5 };
        int res = trap(nums);
        System.out.println(res);
    }

    private static int trap(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int maxLeft = 0;// Counter Variable for storing left biggest tower for each tower
        int maxRight = 0;// Counter Variable for storing right biggest tower for each tower

        leftArr[0] = nums[0];
        rightArr[nums.length - 1] = nums[nums.length - 1];

        // Auxillary Array to store left most big tower for each index
        for (int i = 0; i < nums.length - 1; i++) {
            leftArr[i] = Math.max(nums[i], maxLeft);
            maxLeft = leftArr[i];
        }
        // Auxillary Array to store right most big tower for each index
        for (int i = nums.length - 1; i >= 0; i--) {
            rightArr[i] = Math.max(nums[i], maxRight);
            maxRight = rightArr[i];
        }
        // Now calculating volume of water on each tower
        int totalVolume = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            totalVolume += Math.min(leftArr[i], rightArr[i]) - nums[i];
        }
        return totalVolume;
    }
}
