import java.util.*;
import java.io.*;
 class A1362 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		while (t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long min = Math.min(a, b);
			long max = Math.max(a, b);
			long m = max / min;
			int ans = 0;
			boolean val = max % min == 0;
			while (m != 1) {
				if (m % 8 == 0) {
					m /= 8;
					ans++;
				} else if (m % 4 == 0) {
					m /= 4;
					ans++;
				} else if (m % 2 == 0) {
					m /= 2;
					ans++;
				} else {
					val = false;
					break;
				}
			}
			pw.println(val ? ans : -1);
		}
		pw.close();
	}
 
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public Scanner(FileReader r) {
			br = new BufferedReader(r);
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = nextInt();
			return arr;
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
	}
}