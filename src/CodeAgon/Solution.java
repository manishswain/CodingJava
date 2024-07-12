package CodeAgon;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        func(str);

    }

    private static void func(String str) {
        char ch[] = str.toCharArray();
        int charCount = 0, numCount = 0;
        for (char c : ch) {
            if (Character.isAlphabetic(c)) {
                charCount++;
            }
            if (Character.isDigit(c)) {
                numCount++;
            }
        }
        int sum = charCount+numCount;
        if(sum<5 || sum >20)
        {
            System.out.println("Invalid Sentence");
            return;
        }
        System.out.println("Digits " + numCount);
        System.out.println("Letters " + charCount);
    }
}
