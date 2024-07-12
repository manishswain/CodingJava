package Questions;

import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		boolean res = false;
		StringBuilder s3 = new StringBuilder(s2);
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s3.length(); j++) {
				if (s1.charAt(i) == s3.charAt(j)) {
					s3.deleteCharAt(j);
					if (i == s1.length() - 1 && s3.length() == 0) {
						res = true;
						break;
					}
					break;
				}
			}
		}
		if (res) {
			System.out.println("YES");
		} else
			System.out.println("NO");
		sc.close();
	}
}
