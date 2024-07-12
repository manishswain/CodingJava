package CodeChef;
import java.util.*;
import java.io.*;
class Laddus 
{
    public static void main(String[] args) {
		FastScanner sc=new FastScanner();
        int T=sc.nextInt();
        for (int tt=0; tt<T; tt++) 
        {
           int n=sc.nextInt();
           String nat=sc.next();int sum=0;
           while(n-->0)
           {
               String act=sc.next();
               if(act.equals("CONTEST_WON"))
               {
                   int rank=sc.nextInt();
                    if(rank<20)
                        sum+=300+(20-rank);
                    else
                        sum+=300;
               }
               else if(act.equals("TOP_CONTRIBUTOR"))
               {
                   sum+=300;
               }
               else if(act.equals("BUG_FOUND"))
               {
                   int bug=sc.nextInt();
                   sum+=bug;
               }
               else if(act.equals("CONTEST_HOSTED"))
               {
                   sum+=50;
               }
            }
            if(nat.equals("INDIAN"))
                System.out.println(sum/200);
            else
                System.out.println(sum/400);
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