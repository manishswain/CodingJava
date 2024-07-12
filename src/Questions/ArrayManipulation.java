package Questions;

import java.util.*;
import java.util.Scanner;

public class ArrayManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int arr[] = new int[n + 3];
		int m[][] = new int[a][3];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		int i = 0, j = 0;
		for (int k = 0; k < a; k++) {
			arr[m[i][j]] += m[i][j + 2];
			arr[m[i][j + 1] + 1] -= m[i][j + 2];
			System.out.println(Arrays.toString(arr));
			for (int z = m[i][j]; z <= m[i][j + 1]; z++) {
				arr[z + 1] += m[i][j + 2];
				System.out.println(Arrays.toString(arr));
			}
			i++;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		int max = Integer.MIN_VALUE;
		for (int q = 0; q < n + 2; q++) {
			if (arr[q] > max) {
				max = arr[q];
			}
		}
		System.out.println(max);
		sc.close();
	}
}
