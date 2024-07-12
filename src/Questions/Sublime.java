package Questions;

class Fact {
	public static void main(String[] args) {
		long n = 10;
		System.out.print(fact(n));
	}

	static long fact(long n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
}