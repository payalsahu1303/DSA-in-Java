// Given an unsorted array arr of size n that contains only non negative integers.
// Find a subarray (continuous elements) that has sum equal to s.
// Return the start and end indices of the subarray that has sum equal to s.
// If no such subarray exists, return [-1, -1].

import java.util.Arrays;

public class IndexesOfSubarraySum {
    public int[] indexes(int[] arr, int s) {
        int n = arr.length;
        int sum = 0;
        int start = 0;
        int end = 0;
        for (end = 0; end < n; end++) {
            sum = sum + arr[end];
            while (sum > s && start <= end) {
                sum = sum - arr[start];
                start++;
            }
            if (sum == s) {
                return new int[] { start, end };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        IndexesOfSubarraySum obj = new IndexesOfSubarraySum();
        int[] arr = { 2, 4, 5, 1, 0, 9 };
        int s = 11;
        int[] result = obj.indexes(arr, s);
        System.out.println(result[0] + " " + result[1]);
    }
}

// The algorithm finds a subarray with sum `s` with time complexity of O(n) and
// space complexity of O(1) by maintaining a
// sliding window and adjusting start-end indices.