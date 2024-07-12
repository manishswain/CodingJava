package CodeAgon;

import java.util.Scanner;

public class SolutionClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
