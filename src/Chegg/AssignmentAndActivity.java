package Chegg;

import java.util.Arrays;
import java.util.Random;

public class AssignmentAndActivity {

    public static void main(String[] args) {
        AssignmentAndActivity aaa = new AssignmentAndActivity();
        Random generator = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = generator.nextInt(10000);
        }

        int key = array[9999];
        System.out.println("Array before sort:" + Arrays.toString(array));
        System.out.println("");

        long startTime = System.nanoTime();
        Arrays.sort(array);
        aaa.quicksort(array); // Class Activity
        aaa.bubbleSort(array); // Assignment
        aaa.heapsort(array); // Assignment
        aaa.selectionsort(array); // Assignment
        aaa.insertionsort(array); // Assignment
        aaa.mergesort(array); // Assignment
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        System.out.println(
                "Start time: " + startTime + " End time: " + endTime + " Elapsed time in nanosecond: " + elapsedTime);
        System.out.println("\nArray after sort:" + Arrays.toString(array));

        // test the program using linear/sequential search, use start and end time to
        // display the time it takess - class activity

        System.out.println("");
        startTime = System.nanoTime();
        System.out.println("Using binary search iterative : ");
        System.out.println(binarySearchIterative(array, key) ? key + " Found" : key + " Not found");
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(
                "Start time: " + startTime + " End time: " + endTime + " Elapsed time in nanosecond: " + elapsedTime);
        System.out.println("");

        startTime = System.nanoTime();
        System.out.println("Using binary search recursive : ");
        System.out
                .println(binarySearchRecursive(array, key, 0, array.length - 1) ? key + " Found" : key + " Not found");
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(
                "Start time: " + startTime + " End time: " + endTime + " Elapsed time in nanosecond: " + elapsedTime);

    }

    private void mergesort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        // System.out.println("Merge Sort-"+Arrays.toString(array));

    }

    // Assignment
    private void insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        // System.out.println("Insertion Sort-"+Arrays.toString(arr));
    }

    // Assignment
    private void selectionsort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;// searching for lowest index
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        // System.out.println("Selection Sort -" + Arrays.toString(array));
    }

    // Assignment
    private void heapsort(int[] array) {
        heapSortImplement(array);
        // System.out.println("Heap Sort -" + Arrays.toString(array));
    }

    // Assignment
    private void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        // System.out.println("Bubble Sort-"+Arrays.toString(arr));
    }

    // Class Activity
    private void quicksort(int[] array) {
        quickSortAlgo(array);
    }

    public static boolean binarySearchRecursive(int[] array, int key, int start, int end) {
        int middle = (start + end) / 2;

        if ((array[start] == array[middle]) && (array[end] == array[middle])) {
            start++;
            end--;
        }

        if (end < start) {
            return false;
        }

        if (key < array[middle]) {
            return binarySearchRecursive(array, key, start, middle - 1);
        } else if (key > array[middle]) {
            return binarySearchRecursive(array, key, middle + 1, end);
        } else if (key == array[middle]) {
            return true;
        }
        return false;
    }

    public static boolean binarySearchIterative(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if ((array[start] == array[middle]) && (array[end] == array[middle])) {
                start++;
                end--;
            }
            if (key < array[middle]) {
                end = middle - 1;
            } else if (key > array[middle]) {
                start = middle + 1;
            } else if (key == array[middle]) {
                return true;
            }
        }
        return false;
    }
    // Functions for merge sort start here.

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    // functions for merge sort end here

    // functions for quicksort algorithm start here

    private static void quickSortAlgo(int[] arr) {
        int low = 0, high = arr.length - 1;
        quickSort(arr, low, high);
        // System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Functions for quick sort algorithm end here.

    // Functions for heap sort algorithm start here.

    public void heapSortImplement(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        // Find largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
    // Functions for heap sort algorithm end here.
}