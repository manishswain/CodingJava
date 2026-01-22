import java.util.*;
import java.io.*;

public class CollisionCourse 
{
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
		int count=0;
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(Double.compare(list.get(i), list.get(j))==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
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


