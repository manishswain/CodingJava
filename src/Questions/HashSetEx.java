package Questions;

import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<HashSet<String>> hs = new HashSet<HashSet<String>>();
		int n = sc.nextInt();
		HashSet<String> h = new HashSet<String>();

		for (int i = 0; i < n; i++) {
			String left = sc.next();
			String right = sc.next();
			h.add(left);
			h.add(right);
			hs.add(h);
			System.out.println(hs);

		}
		sc.close();
	}
}
