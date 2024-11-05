// Implement Quick Sort, a Divide and Conquer algorithm, to sort an array, arr[] in ascending order. Given an array, arr[], with starting index low and ending index high, complete the functions partition() and quickSort(). Use the last element as the pivot so that all elements less than or equal to the pivot come before it, and elements greater than the pivot follow it.

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p_id = partition(arr, low, high);
            quickSort(arr, low, p_id - 1);
            quickSort(arr, p_id + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7, 6, 8 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// The time complexity of QuickSort is O(n log n) on average and O(n^2) in the
// worst case; space complexity is O(log n) due to recursion stack.