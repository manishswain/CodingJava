
package HackerRank;
import java.util.*;
import java.io.*;

public class CollisionCourse 
{
	public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		List<Double> list=new ArrayList<>();
		while(t-->0)
		{
			long x=sc.nextLong();
			long y=sc.nextLong();
			long v=sc.nextLong();
			
			double hyp=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
			
			double res=hyp/v;
			
			list.add(res);
			
		}
		//System.out.println(list);
		Collections.sort(list);
		//System.out.println(list);
		int count=1;long fcount=0,sum=0;
		for(int i=0;i<list.size()-1;i++)
		{
			if(Double.compare(list.get(i), list.get(i+1))==0)
			{
				count++;
			}
			else 
			{
				
				if(count==1)
				{
					continue;
				}
				else
				{
					fcount=factorial(count)/(factorial(2)*factorial(count-2));
					count=1;
					sum+=fcount;
				}
			}
			if(i==list.size()-2)
			{
				fcount=factorial(count)/(factorial(2)*factorial(count-2));
				count=1;
				sum+=fcount;
			}
			
		}
		System.out.println(sum);
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


