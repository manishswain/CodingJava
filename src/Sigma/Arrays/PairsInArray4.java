package Arrays;

public class PairsInArray4 {
    public static void main(String[] args) {
        // Initialize an array with some integers
        int[] arr = { 1, 4, 6, 90, 108, 508, 1000 };

        // Variable to keep track of the total number of pairs
        int totalPairs = 0;

        // Outer loop to iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to iterate through the elements after the current element in the
            // outer loop
            for (int j = i + 1; j < arr.length; j++) {
                // Print the current pair
                System.out.print("(" + arr[i] + "," + arr[j] + ") ,");
                // Increment the total number of pairs
                totalPairs++;
            }
            // Print a new line after each set of pairs for the current element in the outer
            // loop
            System.out.println();
        }

        // Print the total number of pairs
        System.out.println(totalPairs);
    }
}