package Questions;

public class MultipleOf3and5 {
	public static void main(String[] args) {
		System.out.println(res(999));
	}

	static int res(int n) {
		return sum(n, 3) + sum(n, 5) - sum(n, 15);
	}

	static int sum(int n, int i) {
		int x = n / i;
		int sum = i * (x * (x + 1)) / 2;
		return sum;
	}
}
