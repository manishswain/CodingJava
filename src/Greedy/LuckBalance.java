package Greedy;
import java.io.*;
import java.util.*;
public class LuckBalance 
{
    static Comparator<Test> testComparator=new Comparator<Test>(){

        @Override
        public int compare(Test o1, Test o2) 
        {
            if(o1.getImp()==o2.getImp())
            {
                return o2.getLuck()-o1.getLuck();
            }
            return o2.getImp()-o1.getImp();
        }
        
    };
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();int K=k;
        List<Test> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            Test t=new Test(sc.nextInt(), sc.nextInt());
            list.add(t);
        }
        Collections.sort(list, testComparator);
        System.out.println(list);
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            Test t1=list.get(i);
            if(t1.getImp()==0)
            {
                break;
            }
            if(K==0 && t1.getImp()==1)
            {
                sum-=t1.getLuck();
                list.remove(i);i--;
            }
            if(t1.getImp()==1 && K!=0)
            {
                K--;
            }
        }
        
        for(int i=0;i<list.size();i++)
        {
            Test f=list.get(i);
            sum+=f.getLuck();
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
class Test
{
    private int luck;
    private int imp;

    public Test(int luck, int imp) {
        this.luck = luck;
        this.imp = imp;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getImp() {
        return imp;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }

    @Override
    public String toString() {
        return "Test [imp=" + imp + ", luck=" + luck + "]";
    }

    
}