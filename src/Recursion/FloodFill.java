package Recursion;
import java.io.*;
import java.util.*;
public class FloodFill 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=sc.nextInt2DArr(6, 6);

        floodFill(arr , 2 , 3 , 8 , 0);

        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
    
    private static void floodFill(int[][] arr, int r, int c, int toFill, int prevFill) 
    {
        int row=arr.length;
        int col=arr[0].length;

        if(r<0 || r>=row || c<0 || c>=col)
        {
            return;
        }
        if(arr[r][c]!=prevFill)
        {
            return;
        }
        arr[r][c]=toFill;

        floodFill(arr, r-1, c, toFill, prevFill);
        floodFill(arr, r, c-1, toFill, prevFill);
        floodFill(arr, r+1, c, toFill, prevFill);
        floodFill(arr, r, c+1, toFill, prevFill);
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

        public int[][] nextInt2DArr(int n,int m) throws IOException {
            int[][] arr = new int[n][m];
            for (int i = 0; i < arr.length; i++)
                for(int j = 0;j < arr[0].length ; j++)
                    arr[i][j] = nextInt();
            return arr;
        }
    
        public boolean ready() throws IOException {
            return br.ready();
        }
    
    }
}