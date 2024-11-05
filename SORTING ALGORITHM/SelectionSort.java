// Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.

public class SelectionSort {
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = { 10, 9, 12, 22, 40, 32 };
        obj.selectionSort(arr);
    }
}

// The time complexity of this selection sort code is O(n^2), due to nested
// loops, and the space complexity is O(1), as it uses a constant amount of
// extra space.