package Recursion;
import java.util.*;
import java.io.*;
public class BinarySearch 
{
     public static void main(String[] args) throws IOException
     {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=sc.nextIntArr(n);
            int i=search(arr,0,n-1,k);
            System.out.println(i);
        }
     }
     
     private static int search(int[] arr,int l, int r,int k) 
     {
        int m= l+(r-l)/2;
        while(r>=l)
        {
            if(arr[m]==k)
            {
            return 1;
            }
            else if(arr[m]<k)
            {
            return search(arr,m+1,r, k);
            }
            else
            {
            return search(arr,l,m-1, k);
            }
        }
        return -1;
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