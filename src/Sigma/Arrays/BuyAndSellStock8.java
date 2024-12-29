package Arrays;

public class BuyAndSellStock8 {
    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        // int res = maxProfitBrute(nums);
        int res = maxProfit(nums);
        System.out.println(res);
    }

    private static int maxProfit(int[] nums) {
        int n = nums.length;
        int maximumProfit = 0;
        int minBuyingPrice = nums[0];

        for (int i = 1; i < n; i++) {
            minBuyingPrice = Math.min(minBuyingPrice, nums[i]);
            maximumProfit = Math.max(maximumProfit, nums[i] - minBuyingPrice);
        }
        return maximumProfit;
    }

    private static int maxProfitBrute(int[] nums) {
        int n = nums.length;
        int maximumProfit = 0;
        int tempProfit;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                tempProfit = nums[j] - nums[i];
                maximumProfit = Math.max(tempProfit, maximumProfit);
            }
        }
        return maximumProfit;

    }

}
