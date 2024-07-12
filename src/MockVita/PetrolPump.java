package MockVita;
import java.util.*;
import java.io.*;
public class PetrolPump 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        int n=arr.length;
        int arrf[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arrf[i]=Integer.parseInt(arr[i]);
        }
        System.out.print(findTime(arrf, n)); 
    } 
    public static int findMin(int arr[], int i, int sumCalculated,int sumTotal) 
    { 
        if (i == 0) 
            return Math.max((sumTotal-sumCalculated) , sumCalculated); 

        return Math.min(findMin(arr, i - 1, sumCalculated + arr[i-1], sumTotal), findMin(arr, i-1,sumCalculated, sumTotal)); 
    } 

    public static int findTime(int arr[], int n) 
    { 
        int sumTotal = 0; 
        for (int i = 0; i < n; i++) 
        sumTotal += arr[i]; 

        return findMin(arr, n, 0, sumTotal); 
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