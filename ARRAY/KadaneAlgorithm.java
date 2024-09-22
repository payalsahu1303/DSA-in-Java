// Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.

import java.util.Arrays;

public class KadaneAlgorithm {
    public void kadane(int[] arr) {
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.err.println("The maximum sum of subarray is : " + max);
    }

    public static void main(String[] args) {
        KadaneAlgorithm kadane = new KadaneAlgorithm();
        int[] arr = { 1, -2, 4, -1, 0, 3 };
        kadane.kadane(arr);
    }
}

// Since each element in the array is processed exactly once, the time
// complexity of this algorithm is O(n), where n is the length of the input
// array arr.
