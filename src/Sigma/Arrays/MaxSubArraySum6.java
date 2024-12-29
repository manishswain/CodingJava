package Arrays;

import java.util.Arrays;

public class MaxSubArraySum6 {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int[] arr2 = { -100, -1, -100 };
        int[] result1 = maxSubArraySumBrute(arr);
        System.out.println("Min and Max values are " + Arrays.toString(result1));

        int result2 = maxSubArraySumPrefixSum(arr);
        System.out.println("Max values are " + result2);

        int result3 = maxSubArraySumKadanes(arr);
        System.out.println("Max values are " + result3);

        int result4 = maxSubArraySumKadanesCopilot(arr2);
        System.out.println("Max values are " + result4);
    }

    private static int maxSubArraySumKadanesCopilot(int[] arr) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum < 0 ? 0 : maxSum;
    }

    private static int maxSubArraySumKadanes(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = arr[i] + currSum;
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    private static int maxSubArraySumPrefixSum(int[] arr) {
        int maxSubArrSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];
        int localSum = 0;
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }
        System.out.println(Arrays.toString(prefixSum));
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = i; j < prefixSum.length; j++) {

                localSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];

                if (localSum > maxSubArrSum) {
                    maxSubArrSum = localSum;
                }
                // System.out.println(localSum + " " + i + " " + j);
            }
        }
        return maxSubArrSum;
    }

    private static int[] maxSubArraySumBrute(int[] arr) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to iterate through the elements after the current element in the
            // outer loop
            for (int j = i; j < arr.length; j++) {
                int subArrSum = 0;
                for (int k = i; k <= j; k++) {
                    subArrSum += arr[k];
                }
                if (subArrSum < minSum) {
                    minSum = subArrSum;
                } else if (subArrSum > maxSum) {
                    maxSum = subArrSum;
                }
            }
        }
        return new int[] { minSum, maxSum };
    }

}
