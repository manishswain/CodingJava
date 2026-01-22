import java.util.*;
import java.io.*;
class B1342 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = sc.nextIntArr(n);
			HashSet<Integer> og = new HashSet<Integer>();
			for (int i = 0; i < arr.length; i++) {
				og.add(arr[i]);
			}
			int ans = -1;
			loop: for (int k = 1; k < 1024; k++) {
				HashSet<Integer> temp = new HashSet<Integer>();
				for (int x : og) {
					temp.add(x ^ k);
				}
				if (og.size() != temp.size())
					continue;
				for (int x : temp) {
					if (!og.contains(x)) {
						continue loop;
					}
				}
				ans = k;
				break;
			}
			pw.println(ans);
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