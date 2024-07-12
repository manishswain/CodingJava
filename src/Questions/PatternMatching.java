package Questions;

import java.util.*;
import java.util.regex.*;

public class PatternMatching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int no = sc.nextInt();
			String arr[] = new String[no];
			for (int j = 0; j < no; j++) {
				arr[j] = sc.nextLine();
			}
			check(arr);
		}
		sc.close();
	}

	static String check(String[] arr) {

		for (int i = 1; i < arr.length; i++) {
			Pattern p1 = Pattern.compile(arr[i]);
			Pattern p2 = Pattern.compile(arr[i - 1]);
			if (p1.equals(p2)) {

			}
		}

		return null;
	}
}
