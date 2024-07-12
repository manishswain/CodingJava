package Codevita;
import java.util.*;
import java.io.*;
class Samparn3Palin
{
  public static void main(String[] args) throws IOException
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      List<String> list= solver(s);
      for(String s1:list)
      {
          System.out.println(s1);
      }
  }

     private static List<String> solver(String s) {
  	List<String> result = new ArrayList<>();
  	int[] t = new int[s.length()];
  	boolean[][] check = new boolean[s.length()][s.length()];
  	for(int i=0;i<s.length();i++) {
  		int minm = i;
  		for(int j=0;j<=i;j++) {
  			if(s.charAt(j) == s.charAt(i) && (i-j<2 || check[j+1][i-1])){
  				check[j][i] = true;
  				minm = Math.min(minm, j==0 ? 0 : t[j-1] + 1);
  			}
  		}
  		t[i] = minm;
      }
      

  	if(t[s.length()-1] > 2) {
  		result.add("Impossible");
  		return result;
      }
      

  	List<Integer> finalans = new ArrayList<>();
  	for(int i=0;i<s.length() - 1;i++) {
  		if(check[i][s.length()-1] == true)
  			finalans.add(i);
      }
      

  	for(int l : finalans) {
  		for(int i=0;i<l;i++) {
  			if(check[0][i] && check[i+1][l-1]) {
  				result.add(s.substring(0, i+1));
  				result.add(s.substring(i+1, l));
  				result.add(s.substring(l));
  				return result;
  			}
  		}
  	}
  	result.add("Impossible");
  	return result;
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
