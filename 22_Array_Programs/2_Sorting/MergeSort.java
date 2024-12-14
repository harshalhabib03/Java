public class MergeSort {

    // Main method to sort an array using merge sort
    public static void mergeSort(int[] array) {
        
        if (array.length < 2) {
            return; // Base case: if the array is of size 0 or 1, it is already sorted
        }

        int mid = array.length / 2; // Find the midpoint of the array
        int[] left = new int[mid]; // Create left subarray
        int[] right = new int[array.length - mid]; // Create right subarray

        // Fill the left subarray
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        // Fill the right subarray
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        // Recursively sort both subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(array, left, right);
    }

    // Method to merge two sorted arrays into one sorted array
    public static void merge(int[] array, int[] left, int[] right) {
    
        int i = 0; // Index for left array
        int j = 0; // Index for right array
        int k = 0; // Index for main array

        // Merge the two arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements of left array, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements of right array, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Main method to test the merge sort implementation
    public static void main(String[] args) {
       
        int[] array = {48,36,13,52,19,94,21};

        System.out.println("Original array:");
        printArray(array);

        mergeSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
       
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
