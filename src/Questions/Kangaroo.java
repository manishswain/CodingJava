package Questions;

import java.util.*;

public class Kangaroo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		int value = Math.abs(x2 - x1);
		while (true) {
			if (x1 == x2) {
				System.out.println("YES");
				break;
			}
			x1 += v1;
			x2 += v2;
			if (Math.abs(x2 - x1) >= value) {
				System.out.println("NO");
				break;
			}

		}
		sc.close();
	}
}
