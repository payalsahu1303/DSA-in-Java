// Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn’t exist.

public class LinearSearchAlgorithm {
    public int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearchAlgorithm obj = new LinearSearchAlgorithm();
        int[] arr = { 1, 2, 3, 4, 5, 6, 4, 5, 1, 0 };
        int x = 4;
        System.out.println(obj.search(arr, x));
    }
}

// The time complexity is O(n) as it may check each element once. The space
// complexity is O(1) since no additional space scales with input size.