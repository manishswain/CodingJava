package CodeChef;
import java.util.*;
import java.io.*;
class SmartPhone 
{
    public static void main(String[] args) {
		FastScanner sc=new FastScanner();
         int n=sc.nextInt();
         long arr[]=sc.readLongArray(n);
         Arrays.sort(arr);long sum=0;
         for(int i=0;i<n;i++)
         {
            sum=Math.max(sum, arr[i]*(n-i));
         }
        System.out.println(sum);
	}
 
	static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
        }
        long[] readLongArray(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
        }
        
		long nextLong() {
			return Long.parseLong(next());
		}
	}
   
}