package Questions;

import java.util.*;

class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s[] = str.split(" ");
        int n = s.length;
        for (int i = 0; i < s.length / 2; i++) {
            String temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(s[i]);
                break;
            }
            System.out.print(s[i] + " ");
        }
        sc.close();
    }
}