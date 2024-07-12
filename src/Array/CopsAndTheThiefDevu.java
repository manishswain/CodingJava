package Array;
import java.util.*;
import java.io.*;
public class CopsAndTheThiefDevu 
{
    public static void main(String[] args) throws IOException  
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int M=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int range=x*y;
            int arr[]=new int[101];arr[0]=1;
            //System.out.println(Arrays.toString(arr));
            for(int i=0;i<M;i++)
            {
                int z=sc.nextInt();
                arr[z]=1;
                if(z-range<1)
                {
                    for(int j=1;j<z;j++)
                    {
                        arr[j]=1;
                    }
                }
                else
                {
                    int temp=range;int tp=z;
                    while(temp-->0)
                    {
                        arr[--tp]=1;
                    }
                }
                if(z+range>100)
                {
                    for(int j=z+1;j<101;j++)
                    {
                        arr[j]=1;
                    }
                }
                else
                {
                    int temp=range;int tp=z;
                    while(temp-->0)
                    {
                        arr[++tp]=1;
                    }
                }
            }
            int count=0;
            for(int k=1;k<101;k++)
            {
                if(arr[k]==0)
                {
                    count++;
                }
            }
            System.out.println(count);
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