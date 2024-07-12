package Questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            System.out.println(list.get(n / 2));
        }
        sc.close();
    }
}