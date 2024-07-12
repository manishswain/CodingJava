package Codevita;

import java.util.*;
import java.io.*;
public class Test2 
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
        Arrays.sort(arr);
        int brr[]=new int[n];
        int m=Integer.toBinaryString(arr[n-1]).length();
        for(int i=n-1;i>=0;i--)
        {
            brr[i]=binaryFinder(arr[i]);
        }
        //System.out.println(Arrays.toString(brr)+""+m);

        int finalans=setFinder(brr,m);
        //System.out.println(finalans);
        System.out.println(String.format("%"+m+"s",Integer.toBinaryString(finalans)).replaceAll("\\s","0"));
    } 
    
    private static int setFinder(int[] brr, int m) 
    {
        int n = brr.length,countf=0,temp=m,sum=0; 
        for (int i = 1; i < (1<<n); i++) 
        {  
            //System.out.print("{");
            temp=m;sum=0; 
            for (int j = 0; j < n; j++) 
            {
                if ((i & (1 << j)) > 0) 
                {  
                    sum+=brr[j];                                                   
                }
                if(temp-sum==sum)
                {
                    countf++;  
                   // System.out.print(brr[j]+" ");                      
                    //System.out.println(temp+" "+sum); 
                }
                temp=temp+m;
            } 
            //System.out.print("}");       
        }
        return countf;
    }

    private static int binaryFinder(int n) 
    {
        int m=0,count=0;
        String x="";
        while(n > 0)
        {
            m=n%2;
            if(m == 1)
            {
                count++;
            }
            x = m+""+x;
            n = n / 2;
        }
        return count;
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