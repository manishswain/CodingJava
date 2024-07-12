package Questions;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no[] = new int[n];
		for (int i = 0; i < n; i++) {
			no[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int sum = 0;
			do {
				sum += no[i] % 10;
				no[i] = no[i] / 10;
			} while (no[i] != 0);
			System.out.println(sum);
		}
		sc.close();
	}
}
