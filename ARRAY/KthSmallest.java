// Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array.

import java.util.Arrays;

public class KthSmallest {
    public void smallest(int[] arr, int k) {
        int n = arr.length;
        int i = k - 1;
        if (k < n) {
            Arrays.sort(arr);
            System.out.println("Kth smallest element is " + arr[i]);
        } else {
            System.out.println("K is larger than the size of the array");
        }
    }

    public static void main(String[] args) {
        KthSmallest obj = new KthSmallest();
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 4;
        obj.smallest(arr, k);
    }
}

// Time complexity is O(n log n) because of the sorting algorithm used by
// `Arrays.sort()`. Space complexity is O(1) since sorting happens in place,
// with no additional data structures needed other than the input array itself.