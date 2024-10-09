package Arrays;

public class PrintSubArrays5 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 90, 108, 508, 1000 };
        int subArrayCount = 0;
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to iterate through the elements after the current element in the
            // outer loop
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print(",");
                subArrayCount++;
            }
            System.out.println();
        }
        System.out.println(subArrayCount);
    }
}
