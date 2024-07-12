package Questions;

import java.util.*;

public class MapExHR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Map<String, String> ph = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			String phno = sc.nextLine();
			ph.put(name, phno);
		}
		while (sc.hasNext()) {
			String name = sc.nextLine();
			if (!name.isEmpty()) {
				if (ph.containsKey(name)) {
					System.out.println(name + "=" + ph.get(name));
				} else {
					System.out.println("Not found");
				}
			} else
				break;
		}
		sc.close();
	}
}
