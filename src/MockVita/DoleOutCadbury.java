package MockVita;
import java.util.*;
import java.io.*;
public class DoleOutCadbury 
{
    static int res=0;
    static int finalres=0;
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int s=sc.nextInt();

        for(int i=p;i<=q;i++)
        {
            for(int j=r;j<=s;j++)
            {
                count(i,j);
                finalres+=res;
            }
        }
        System.out.println(finalres);
    } 

    private static int count(int i, int j) 
    {
        if(i==1)
        {
            return j;
        }
        if(j==1)
        {
            return i;
        }
        if(i==j)
        {
        	return 1;
        }
        //System.out.println(Math.min(i, j)+" "+(Math.max(i,j)-Math.min(i, j)));
        res=1+count(Math.min(i, j),Math.max(i,j)-Math.min(i, j));
        return res;
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