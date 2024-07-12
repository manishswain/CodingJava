package Greedy;
import java.io.*;
import java.util.*;
class ActivitySelection 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();	
		while(t-->0)
		{
			int n=sc.nextInt();
			int start[]=sc.nextIntArr(n);
            int finish[]=sc.nextIntArr(n);
            List<Activity> list=new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                list.add(new Activity(start[i],finish[i],i+1));
            }

            Comparator<Activity> finishComparator = new Comparator<Activity>()
            {

                @Override
                public int compare(Activity o1, Activity o2) {                 
                    return o1.getFinish()-o2.getFinish();
                }
                
            };
            
            Collections.sort(list, finishComparator);
            
            Activity prev=list.get(0);
            System.out.print(prev.getPos()+" ");

            for(int i=0;i<n;i++)
            {
                Activity curr=list.get(i);
                if(curr.getStart()>=prev.getFinish())
                {
                	System.out.print(curr.getPos()+" ");
                    prev=curr;
                }
            }
            System.out.println();
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
class Activity
{
    private int start;
    private int finish;
    private int pos;

    public Activity(int start, int finish, int pos) {
        this.start = start;
        this.finish = finish;
        this.pos = pos;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    
}