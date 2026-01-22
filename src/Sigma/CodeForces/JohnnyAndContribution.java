import java.util.*;
import java.io.*;
class D1342 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[] adjList = new ArrayList[n];
		for (int i = 0; i < adjList.length; i++) {
			adjList[i] = new ArrayList<Integer>();
		}
		while (m-- > 0) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adjList[a].add(b);
			adjList[b].add(a);
		}
		int[] c = sc.nextIntArr(n);
		boolean valid = true;
		for (int x = 0; x < n; x++) {
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int y : adjList[x]) {
				if (c[y] < c[x])
					hs.add(c[y]);
				if (c[y] == c[x])
					valid = false;
			}
			if (hs.size() != c[x] - 1) {
				valid = false;
				break;
			}
		}
		if (valid) {
			Integer[] ans = new Integer[n];
			for (int i = 0; i < ans.length; i++) {
				ans[i] = i;
			}
			Arrays.sort(ans, (a, b) -> c[a] - c[b]);
			for (int i = 0; i < n; i++) {
				pw.print((ans[i] + 1) + " ");
			}
		} else
			pw.println(-1);
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
