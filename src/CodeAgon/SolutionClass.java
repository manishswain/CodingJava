package CodeAgon;

import java.util.*;
import java.util.stream.*;

public class SolutionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int result = FindAutoCount(n);
        System.out.println(result);
    }

    private static int FindAutoCount(String str) {
        int n = Integer.parseInt(str);
        int digitarray[] = new int[str.length()];
        for (int i = digitarray.length - 1; i >= 0; i--) {
            digitarray[i] = n % 10;
            n = n / 10;
        }
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < digitarray.length; i++) {
            count = 0;
            for (int j = 0; j < digitarray.length; j++) {
                if (i == digitarray[j])
                    count++;
            }
            if (count != digitarray[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            List<Character> list = (ArrayList<Character>) str.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.toList());
            Set<Character> s = new HashSet<>(list);
            return s.size();
        } else
            return 0;
    }
}
