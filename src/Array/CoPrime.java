package Array;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                list.add(i);
            }
        }
        int count = 0;
        for (int k = 0; k < list.size() - 1; k++) {
            for (int i = k + 1; i < list.size(); i++) {
                if (list.get(i) % list.get(k) != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}