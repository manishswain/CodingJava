package Questions;

import java.util.*;

public class StackEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int a = 0; a < t; a++) {
			String s = sc.nextLine();
			boolean res = check(s);
			if (res) {
				System.out.println("balanced");
			} else
				System.out.println("not balanced");
		}
		sc.close();
	}

	static boolean check(String s) {
		Stack<Character> st = new Stack<>();
		char ch[] = s.toCharArray();
		for (char c : ch) {
			if (c == '[' || c == '{' || c == '(') {
				st.push(c);
			} else {
				if (st.isEmpty()) {
					return false;
				}
				st.pop();
			}
		}
		if (st.isEmpty()) {
			return true;
		} else
			return false;
	}
}
