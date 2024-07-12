package CodeChef;
import java.util.*;
import java.io.*;
public class Lapindromes 
{
    public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		 int T=sc.nextInt();
        for (int tt=0; tt<T; tt++) 
        {
            String s=sc.next();
            int arr1[]=new int[26];
            int arr2[]=new int[26];
            int n=s.length();
            if(s.length()%2==0)
            {
                for(int i=0;i<s.length()/2;i++)
                {
                    arr1[s.charAt(i)-'a']++;arr2[s.charAt(n-i-1)-'a']++;
                }
            }
            else 
            {
                for(int i=0;i<=s.length()/2;i++)
                {
                    arr1[s.charAt(i)-'a']++;arr2[s.charAt(n-i-1)-'a']++;
                }
            }
            int count=0;
            for(int i=0;i<26;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    System.out.println("NO");
                    break;
                }
                count++;
            }
            if(count==26)
                System.out.println("YES");
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
   
}