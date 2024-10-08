package MockVita;
import java.util.*;
public class GroovingMonkey1
{
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t --> 0)
    {
      int n=sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
	  ArrayList<Integer> al = new ArrayList<Integer>();
	  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

      int idx = 0;
      int temp = 0;
      int count = 0;
	  for(int i = 0 ; i < arr.length ; i++)
	  {
	  	temp = i+1;
	  	idx = i;
	  	count = 0;
	  	if(! map.containsKey(arr[idx]))
	  	{
	  	  while(temp != arr[idx] )
          {
          	count++;
          	idx=arr[idx]-1;
          	map.put(arr[idx],1);
          }
          if(count != 0)
          {
          	count++;
          	al.add(count);
          }

	  	}
         
	  }	
	  //find the lcm of the ArrayList
	  //convert it to array and pass it to compute for lcm
	  int[] pos = new int[al.size()];
	  for(int i = 0 ; i < pos.length ; i++)
	  {
	  	pos[i]=al.get(i);
	  }
	  if(pos.length == 0)
	  {
	  	System.out.println(1);
	  }
	  else
	  {
	  	long lcm = lcm_of_array_elements(pos);
	  System.out.println(lcm);
	  }
    }
	  sc.close();
	}

    public static long lcm_of_array_elements(int[] element_array) 
    { 
    	
    	if(element_array.length == 1)
    	{
    		return element_array[0];
    	}
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
}