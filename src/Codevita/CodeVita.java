package Codevita;

import java.util.*;

public class CodeVita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                String s = "";
                for (int j = 0; j < n; j++) {
                    s += String.valueOf(sc.nextInt());
                }
                list.add(s);
            }
            // System.out.println(list);
            int ans = Integer.MAX_VALUE, max = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                String s1 = list.get(i);
                for (int j = 1; j < list.size(); j++) {
                    String s2 = list.get(j);
                    max = lcs(s1, s2, s1.length(), s2.length());
                    if (max < ans)
                        ans = max;
                    if (ans == 0)
                        break;
                }
            }
            System.out.println(ans);
        }
    }

    private static int lcs(String s1, String s2, int n, int m) {
        int t[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            t[i][0] = 0;
        }
        for (int i = 0; i < m + 1; i++) {
            t[0][i] = 0;
        }
        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    max = Math.max(max, t[i][j]);
                } else
                    t[i][j] = 0;
            }
        }
        return max;
    }
}