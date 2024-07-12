package Test;

import java.util.*;

public class Solution33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int maxspread = 2;
        int res = groupDivision(list, maxspread);
        System.out.println(res);

    }

    public static int groupDivision(List<Integer> list, int maxSpread) {
        Collections.sort(list);
        int n = list.size();
        int nc = 0;

        int i = 0;
        while (i < n) {
            nc++;
            int ccs = list.get(i);
            while (i < n && list.get(i) <= ccs + maxSpread) {
                i++;
            }
        }
        return nc;
    }
}
