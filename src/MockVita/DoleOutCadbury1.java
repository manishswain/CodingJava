package MockVita;
import java.util.*;
import java.io.*;
public class DoleOutCadbury1
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int s=sc.nextInt();
        int finalres=0;
        for(int i=p;i<=q;i++)
        {
            for(int j=r;j<=s;j++)
            {
                int res=count(i,j);
                finalres+=res;
            }
        }
        System.out.println(finalres);
    } 

    private static int count(int i, int j) 
    {
        int res=0;
        while(i!=0 && j!=0)
        {
            if(i>j)
            {
                i=i-j;
            }
            else
                j=j-i;
            res++;
        }
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