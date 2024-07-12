package Test;

import java.util.*;

public class Solution17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of runners");
        int n = sc.nextInt();
        if (n <= 0 || n > 10) {
            System.out.println(n + " is an invalid number of runners");
            return;
        }
        String temp = "";
        String name[] = new String[n];
        double time[] = new double[n];
        System.out.println("Enter the runner details");
        for (int i = 0; i < n; i++) {
            temp = sc.next();
            String temparr[] = temp.split(",");
            name[i] = temparr[0];
            time[i] = Float.parseFloat(temparr[1]);
            if (time[i] > 12 || time[i] < 8) {
                System.out.println(time[i] + " is an invalid input");
                Runtime.getRuntime().halt(0);
            }
        }
        int maxcount = 0;
        double maxrep = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (time[i] == time[j]) {
                    count++;
                }
            }
            if (count >= maxcount) {
                maxcount = count;
                maxrep = time[i];
            }
        }
        if (maxcount == n) {
            System.out.println(n + " runners have same timing");
        } else if (maxcount == 0) {
            System.out.println("No runners with same time.");
        } else {
            for (int i = 0; i < n; i++) {
                if (maxrep == time[i]) {
                    System.out.println(name[i]);
                }
            }
        }
    }
}