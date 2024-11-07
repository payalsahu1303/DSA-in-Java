// Given an array of size N. The task is to sort the array elements by completing functions heapify() and buildHeap() which are used to implement Heap Sort.

public class HeapSort {

    void buildHeap(int arr[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[i] < arr[left]) {
            largest = left;
        }
        if (right < n && arr[largest] < arr[right]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public void heapSort(int arr[], int n) {
        buildHeap(arr, n);
        for (int i = n - 1; i >= 0; i--) {
            int swap = arr[i];
            arr[i] = arr[0];
            arr[0] = swap;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        obj.heapSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// The time complexity of HeapSort is O(n log n) for sorting, and the space
// complexity is O(1) due to in-place sorting without extra arrays.