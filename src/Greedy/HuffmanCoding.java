package Greedy;
import java.io.*;
import java.util.*;
class Huffman 
{
    int data;
    char c;
    Huffman left;
    Huffman right;
}
public class HuffmanCoding 
{
    public static void main(String[] args) throws IOException
    {
        Comparator<Huffman> dComparator=new Comparator<Huffman>(){

            @Override
            public int compare(Huffman o1, Huffman o2) {
                return o1.data-o2.data;
            }
            
        };
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.nextLine();
            int n=s.length();
            int arr[]=new int[n];
            arr=sc.nextIntArr(n);

            PriorityQueue<Huffman> q=new PriorityQueue<>(n,dComparator);

            for(int i=0;i<n;i++)
            {
                Huffman node=new Huffman();

                node.data=arr[i];
                node.c=s.charAt(i);
                node.left=null;
                node.right=null;

                q.add(node);
            }
            Huffman root=null;
            while(q.size()>1)
            {
                Huffman x=q.peek();
                q.poll();

                Huffman y=q.peek();
                q.poll();

                Huffman z=new Huffman();

                z.data=x.data+y.data;
                z.c='-';
                z.left=x;
                z.right=y;

                root=z;

                q.add(z);               
            }
            printHuffmanCode(root,"");
        }
    }
    
    private static void printHuffmanCode(Huffman root, String s) 
    {
        if(root.left==null && root.right==null && Character.isLetter(root.c))
        {
            System.out.print(s+" ");
            return;
        }

        printHuffmanCode(root.left, s+"0");
        printHuffmanCode(root.right, s+"1");
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
