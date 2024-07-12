package Questions;

import java.util.*;

public class IsUnique {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean cond = chars(str);
		if (cond) {
			System.out.println("Unique");
		} else
			System.out.println("Not Unique");
		sc.close();
	}

	static boolean chars(String str) {
		boolean flag[] = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (flag[val]) {
				return false;
			}
			flag[val] = true;
		}
		return true;
	}
}
