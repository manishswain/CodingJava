package Questions;

import java.util.HashSet;
import java.util.Scanner;

public class WeightedUniformString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Integer> set = new HashSet<>();
        int currentSum = 0;
        char prevChar = ' ';
        for (char c : s.toCharArray()) {
            if (c != prevChar) {
                currentSum = c - 'a' + 1;
            } else {
                currentSum += c - 'a' + 1;
            }
            prevChar = c;
            set.add(currentSum);
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer query = sc.nextInt();
            if (set.contains(query)) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
        sc.close();
    }
}
