package Questions;

import java.util.*;

class q2 {
    public static void main(String[] args) {
        int ans = func(100, 200);
        System.out.println(ans);
    }

    public static int func(int a, int b) {
        if (b == 0) {
            return a;
        } else
            return func(b, a % b);
    }
}