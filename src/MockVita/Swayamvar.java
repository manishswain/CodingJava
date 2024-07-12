package MockVita;
import java.util.*;
import java.io.*;
public class Swayamvar 
{
    public static void main(String[] args) throws IOException  
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String bride=sc.next();
        String groom=sc.next(); 
        List<Character> bridelist=new ArrayList<>();
        List<Character> groomlist=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            bridelist.add(bride.charAt(i));
            groomlist.add(groom.charAt(i));
        }

        for(int i=0;i<n;i++)
        {
            if(groomlist.contains(bridelist.get(i)))
            {
               groomlist.remove(bridelist.get(i));
            }
            else
            {
                break;
            }
        }
        System.out.println(groomlist.size());
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