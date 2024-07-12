package Questions;

import java.util.Scanner;

public class URLify {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();

		System.out.println(str1.replace(" ", "%20"));
		sc.close();
	}
}
