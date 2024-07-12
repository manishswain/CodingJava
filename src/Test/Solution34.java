package Test;

import java.util.ArrayList;
import java.util.List;

class SmallestSubstringWithKOnes {

    public static String getSubstring(String inputStr, int k) {
        int n = inputStr.length();
        List<Integer> oi = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (inputStr.charAt(i) == '1') {
                oi.add(i);
            }
        }

        if (oi.size() < k) {
            return "";
        }

        String smallestSubstring = inputStr;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i <= oi.size() - k; i++) {
            int start = oi.get(i);
            int end = oi.get(i + k - 1);
            String candidate = inputStr.substring(start, end + 1);

            if (candidate.length() < minLength
                    || (candidate.length() == minLength && candidate.compareTo(smallestSubstring) < 0)) {
                smallestSubstring = candidate;
                minLength = candidate.length();
            }
        }

        return smallestSubstring;
    }

    public static void main(String[] args) {
        // Example usage
        String inputStr = "0101101";
        int k = 3;
        String result = getSubstring(inputStr, k);
        System.out.println("Smallest substring with " + k + " ones: " + result);
    }
}