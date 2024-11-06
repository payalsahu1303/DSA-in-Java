// Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

public class MergeSort {
    // divide function
    public void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    // conquer function
    public void conquer(int[] arr, int start, int mid, int end) {
        int[] merge = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merge[k++] = arr[i++];
            } else {
                merge[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merge[k++] = arr[i++];
        }
        while (j <= end) {
            merge[k++] = arr[j++];
        }
        for (int x = 0, y = start; x < merge.length; x++, y++) {
            arr[y] = merge[x];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = { 5, 3, 8, 4, 2 };
        int n = arr.length;
        mergeSort.divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// The time complexity of the `MergeSort` code is O(n log n), and the space
// complexity is O(n), due to the temporary `merge` array used in each recursive
// call.