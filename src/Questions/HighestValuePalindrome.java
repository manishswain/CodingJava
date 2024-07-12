package Questions;

import java.util.Scanner;

public class HighestValuePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        for (int i = 0; i < n; i++) {
            while (k != 0) {
                if ((str.charAt(i) == str.charAt(n - i - 1))) {
                    break;
                } else {
                    if ((int) str.charAt(i) > (int) str.charAt(n - i - 1)) {
                        str = str.substring(0, n - i - 1) + str.charAt(i) + str.substring(n - i, n);
                        k--;
                    } else {
                        str = str.substring(0, i) + str.charAt(n - i - 1) + str.substring(i + 1, n);
                        k--;
                    }
                }
                // System.out.println(str);
            }
        }
        boolean res = isPalindrome(str);
        if (res) {
            System.out.println(str);
        } else
            System.out.println("-1");
        sc.close();
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < s.length() / 2; i++) {
            if (!(s.charAt(i) == s.charAt(n - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
