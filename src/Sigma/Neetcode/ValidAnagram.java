package Neetcode;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "rat";
        String t = "tara";

        System.out.println(validAnagram(s, t));
    }

    private static boolean validAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] countArr = new int[26];

        for (char c : s.toCharArray()) {
            countArr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            countArr[c - 'a']--;
        }

        for (int check : countArr) {
            if (check != 0) {
                return false;
            }
        }
        return true;
    }

}
