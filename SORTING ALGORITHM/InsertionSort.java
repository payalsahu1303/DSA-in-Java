// The task is to complete the insert() function which is used to implement Insertion Sort.

public class InsertionSort {
    public void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = { 10, 4, 5, 7, 0, 3, 1 };
        obj.insert(arr);
    }
}

// The time complexity of this insertion sort implementation is O(n^2) in the
// worst case, and O(n) in the best case. Space complexity is O(1).