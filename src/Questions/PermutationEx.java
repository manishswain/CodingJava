package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (permutation(str1, str2)) {
			System.out.println("Permutation of each other");
		} else
			System.out.println("Habani");
		System.out.println("-------------------------------");
		if (permutation1(str1, str2)) {
			System.out.println("Permutation of each other");
		} else
			System.out.println("Habani");
		sc.close();
	}

	static boolean permutation1(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int n[] = new int[128];

		for (int i = 0; i < str1.length(); i++) {
			n[str1.charAt(i)]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			int m = (int) str2.charAt(i);
			--n[m];
			if (n[m] < 0) {
				return false;
			}
		}
		return true;
	}

	static boolean permutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		return sort(str1).equals(sort(str2));

	}

	static String sort(String str) {
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

}
