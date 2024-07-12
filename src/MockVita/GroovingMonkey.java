package MockVita;
import java.util.*;
import java.io.*;

public class GroovingMonkey 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t --> 0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n+1];
            for(int i=1;i<=n;i++)
            {
                arr[i]=sc.nextInt();
            }
            HashSet<Integer> set=new HashSet<>(n);
            for(int i=1;i<n+1;i++)
            {
                if(arr[i]==0)
                {
                    continue;
                }
                int current=i;
                int block=i;
                int count =0;
                while(true)
                {
                    current=arr[current];
                    arr[block]=0;
                    block=current;
                    count+=1;
                    if(current==i)
                    {
                        break;
                    }
                }
                set.add(count);
            }
            //int[] brr = set.stream().mapToInt(i -> i).toArray();
            int[] brr = set.parallelStream().mapToInt(i -> i).toArray();
            //System.out.println(Arrays.toString(brr));
            System.out.println(lcm_of_array_elements(brr));
        }
    }
    public static long lcm_of_array_elements(int[] element_array) 
    { 
        long lcm_of_array_elements = 1; 
        int divisor = 2; 
          
        while (true) { 
            int counter = 0; 
            boolean divisible = false; 
              
            for (int i = 0; i < element_array.length; i++) { 
  
                // lcm_of_array_elements (n1, n2, ... 0) = 0. 
                // For negative number we convert into 
                // positive and calculate lcm_of_array_elements. 
  
                if (element_array[i] == 0) { 
                    return 0; 
                } 
                else if (element_array[i] < 0) { 
                    element_array[i] = element_array[i] * (-1); 
                } 
                if (element_array[i] == 1) { 
                    counter++; 
                } 
  
                // Divide element_array by devisor if complete 
                // division i.e. without remainder then replace 
                // number with quotient; used for find next factor 
                if (element_array[i] % divisor == 0) { 
                    divisible = true; 
                    element_array[i] = element_array[i] / divisor; 
                } 
            } 
  
            // If divisor able to completely divide any number 
            // from array multiply with lcm_of_array_elements 
            // and store into lcm_of_array_elements and continue 
            // to same divisor for next factor finding. 
            // else increment divisor 
            if (divisible) { 
                lcm_of_array_elements = lcm_of_array_elements * divisor; 
            } 
            else { 
                divisor++; 
            } 
  
            // Check if all element_array is 1 indicate  
            // we found all factors and terminate while loop. 
            if (counter == element_array.length) { 
                return lcm_of_array_elements; 
            } 
            
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