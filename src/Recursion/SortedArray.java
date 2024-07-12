package Recursion;
import java.util.*;
import java.io.*;
public class SortedArray 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=sc.nextIntArr(n);
            int i=check(arr,n-1);
            System.out.println(i);
        }
    } 
    
    private static int check(int[] arr, int n) {
        if(n==0 || n==1)
        {
            return 1;
        }
        else if(arr[n]<arr[n-1])
        {
            return 0;
        }
        else 
        {
            return check(arr, n-1);
        }
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