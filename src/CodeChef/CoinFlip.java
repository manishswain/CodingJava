package CodeChef;
import java.util.*;
import java.io.*;
public class CoinFlip 
{
    public static void main(String[] args) {
		FastScanner sc=new FastScanner();
        int T=sc.nextInt();
        for (int tt=0; tt<T; tt++) 
        {
           int g=sc.nextInt();
           while(g-->0)
           {
               int i=sc.nextInt();
               long n=sc.nextLong();
               int q=sc.nextInt();

               if(n%2==0)
               {
                   System.out.println(n/2);
                   continue;
               }
               else
               {
                   if(i==1)
                   {
                        if(q==1)
                        {
                            System.out.println(n/2);
                        }
                        else
                            System.out.println(n/2+1);
                   }
                   else
                   {
                        if(q==2)
                        {
                            System.out.println(n/2);
                        }
                        else
                            System.out.println(n/2+1);
                   }
               }
           }

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