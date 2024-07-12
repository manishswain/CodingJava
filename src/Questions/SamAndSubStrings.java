package Questions;

import java.util.*;

public class SamAndSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        ArrayList<String> res = new ArrayList<>();
        permute(input, res);
        long sum = 0;
        // System.out.println(res);
        for (int i = 0; i < res.size(); i++) {
            sum = (sum % M + Long.valueOf(res.get(i)) % M) % M;
        }
        System.out.println(sum);
        sc.close();
    }

    static final int M = 1000000007;

    private static void permute(String input, ArrayList<String> res) {
        int n = input.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n; j++) {
                if (input.substring(i, j).length() == 0) {
                    continue;
                }
                res.add(input.substring(i, j));
            }
        }
    }
}
