package Questions;

import java.util.*;

public class StringQ1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.concat(B).length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else
            System.out.println("No");

        System.out.println(Character.toUpperCase(A.charAt(0)) + A.toUpperCase().substring(1).toLowerCase() + " "
                + "" + Character.toUpperCase(B.charAt(0)) + B.toUpperCase().substring(1).toLowerCase());

        StringBuffer sb = new StringBuffer(A);
        sb.append(6.787877);
        System.out.println(sb);
        sc.close();
    }
}
