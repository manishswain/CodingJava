package Test;

import java.util.*;

public class Solution20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word[] = str.split(" ");
        if (str.matches("[a-zA-Z ]+")) {
            for (int i = 0; i < word.length; i++) {
                String unique = word[i];
                StringBuilder sb = new StringBuilder(unique);
                for (int j = 0; j < sb.length(); j++) {
                    for (int k = j + 1; k < sb.length(); k++) {
                        if (sb.charAt(j) == sb.charAt(k)) {
                            sb.deleteCharAt(k);
                            sb.deleteCharAt(j);
                        }
                    }
                }
                System.out.print(sb + " ");
            }
        } else {
            System.out.println(str + " Invalid Sentence");
        }
    }
}
