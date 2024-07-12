package CodeChef;
import java.util.*;
import java.io.*;
class Carvans 
{
    public static void main(String[] args) {
		FastScanner sc=new FastScanner();
        int T=sc.nextInt();
        for (int tt=0; tt<T; tt++) 
        {
            int n=sc.nextInt();
            int arr[]=sc.readArray(n);
            int count=1;
            for(int i=1;i<n;i++)
            {
                if(arr[i-1]<arr[i])
                {
                    arr[i]=arr[i-1];
                }
                else
                    count++;
            }
            System.out.println(count);
        } 
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