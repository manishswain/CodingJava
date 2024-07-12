package Questions;

import java.util.*;

class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term of which u want to find the value in fibonacci series");
		int a = sc.nextInt();
		System.out.println(fib(a));
		sc.close();
	}

	static int fib(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 1 || n == 2) {
			return n - 1;
		} else
			return fib(n - 2) + fib(n - 1);
	}
}