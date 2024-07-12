package Questions;

import java.util.*;

public class RightRotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int q = sc.nextInt();
		int arr[] = new int[n];
		if (d > n) {
			d = n % d;
		}
		for (int i = 0; i < n; i++) {
			if (i + d < n) {
				arr[i + d] = sc.nextInt();
			} else
				arr[d + i - n] = sc.nextInt();
		}
		for (int i = 0; i < q; i++) {
			System.out.println(arr[sc.nextInt()]);
		}
		sc.close();
	}
}