package Recursion;

import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String op = new String("");
        Set<String> list = new HashSet<>();
        solve(ip, op, list);
        List<String> set = new ArrayList<>(list);
        Collections.sort(set);
        for (String s : set) {
            System.out.println(s);
        }
        sc.close();
    }

    private static void solve(String input, String output, Set<String> list) {
        if (input.length() == 0) {
            if (output.length() != 0) {
                char[] ch = output.toCharArray();
                Arrays.sort(ch);
                String output1 = new String(ch);
                list.add(output1);
            }
            return;
        }
        String out1 = output;
        String out2 = output;
        out2 += input.charAt(0);
        input = input.substring(1);

        solve(input, out1, list);
        solve(input, out2, list);
    }
}
