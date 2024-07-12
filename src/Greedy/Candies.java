package Greedy;
import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Candies 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int candies[]=new int[n];
        candies[0]=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                candies[i]=candies[i-1]+1;
            }
            if(arr[i]<=arr[i-1])
            {
                candies[i]=1;
            }
        }
        //System.out.println(Arrays.toString(candies));
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                if(candies[i]<=candies[i+1])
                {
                    candies[i]=candies[i+1]+1;
                }
            }
        }

        BigInteger sum=BigInteger.ZERO;
        for(int i=0;i<n;i++)
        {
            sum=sum.add(BigInteger.valueOf(candies[i]));
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