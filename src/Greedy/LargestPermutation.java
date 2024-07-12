package Greedy;
public class LargestPermutation 
{
    static void KswapPermutation( 
        int arr[], int n, int k) 
    { 
  
        // Auxiliary dictionary of storing 
        // the position of elements 
        int pos[] = new int[n + 1]; 
  
        for (int i = 0; i < n; ++i) 
            pos[arr[i]] = i; 
  
        for (int i = 0; i < n && k > 0; ++i) { 
  
            // If element is already i'th 
            // largest, then no need to swap 
            if (arr[i] == n - i) 
                continue; 
  
            // Find position of i'th largest 
            // value, n-i 
            int temp = pos[n - i]; 
  
            // Swap the elements position 
            pos[arr[i]] = pos[n - i]; 
            pos[n - i] = i; 
  
            // Swap the ith largest value with the 
            // current value at ith place 
            int tmp1 = arr[temp]; 
            arr[temp] = arr[i]; 
            arr[i] = tmp1; 
  
            // decrement number of swaps 
            --k; 
        } 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
  
        int arr[] = { 4, 5, 2, 1, 3 }; 
        int n = arr.length; 
        int k = 3; 
  
        KswapPermutation(arr, n, k); 
  
        System.out.print( 
            "Largest permutation "
            + "after " + k + " swaps:\n"); 
  
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
    } 
}