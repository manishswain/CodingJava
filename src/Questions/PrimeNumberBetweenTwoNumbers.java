package Questions;

import java.util.Scanner;

public class PrimeNumberBetweenTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a < b) {
			boolean flag = false;
			for (int i = 2; i <= a / 2; ++i) {
				// condition for nonprime number
				if (a % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag && a != 0 && a != 1)
				System.out.print(a + " ");
			++a;
		}

		sc.close();
	}
}
