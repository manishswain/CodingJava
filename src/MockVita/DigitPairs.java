package MockVita;
import java.util.*;
import java.io.*;
public class DigitPairs 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();int t=T;
        int arr[]=new int[t];int i=0;
        while(T-->0)
        {
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
            while(n!=0)
            {
                int d=n%10;
                n=n/10;
                if(d>max) max=d;
                if(d<min) min=d;
            }
            int bit=max*11+min*7;
            //System.out.println(bit);
            arr[i++]=bit%100;
        }
        System.out.println(Arrays.toString(arr));
        int pair=0;
        int count[]=new int[10];
        for(int j=0;j<t-2;j=j+2)
        {
            for(int k=j+2;k<t;k=k+2)
            {
                if(k<t)
                {
                    if(arr[j]/10==arr[k]/10)
                    { 
                        count[arr[j]/10]++;
                        if(count[arr[j]/10]<3)
                             pair++; 
                    }
                }
                else break;
            }
        }
        for(int j=1;j<t-2;j=j+2)
        {
            for(int k=j+2;k<t;k=k+2)
            {
                if(k<t)
                {
                    if(arr[j]/10==arr[k]/10)
                    {
                        count[arr[j]/10]++;
                        if(count[arr[j]/10]<3)
                             pair++;                      
                    }
                }
                else break;
            }
        }
        System.out.println(pair);
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