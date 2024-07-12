package Questions;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, x = 1;
		m = sc.nextInt();
		while (m >= x) {
			n = sc.nextInt();

			BigInteger fact = BigInteger.ONE;

			for (int i = 1; i <= n; i++) {
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
			x++;
		}
		sc.close();
	}
}
