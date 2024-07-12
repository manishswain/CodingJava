package Greedy;
import java.io.*;
import java.util.*;
public class GridChallenge 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {        
            int n=sc.nextInt();int N=n;
            String s=sc.nextLine();
            char res[][]=new char[n][s.length()];
            int j=0;
            while(N-->0)
            {
                if(N+1!=n)
                {
                    s=sc.nextLine();
                }             
                char ch[]=s.toCharArray();
                Arrays.sort(ch);
                for(int i=0;i<s.length();i++)
                {
                    if(j<n)
                    {
                        res[j][i]=ch[i];
                    }                   
                }
                j++;
            }
            //System.out.println(Arrays.deepToString(res).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            boolean flag=true;
            for(int i=0;i<s.length();i++)
            {
                if(!flag)
                {
                    break;
                }
                for(int k=0;k<n-1;k++)
                {
                    if((int)res[k][i]-(int)res[k+1][i]>0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            //System.out.println(Arrays.deepToString(res).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
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