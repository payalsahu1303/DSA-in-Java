// Given an integer array, the task is to find the maximum product of any subarray.

import java.util.Arrays;

public class MaximumProductSubarray {
    public void maximumProduct(int[] arr) {
        int curr = arr[0];
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int totalMax = maxProduct;

        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            maxProduct = Math.max(curr, Math.max(curr * maxProduct, curr * minProduct));
            minProduct = Math.min(curr, Math.min(curr * maxProduct, curr * minProduct));
            totalMax = Math.max(maxProduct, totalMax);
        }
        System.out.println("Maximum product of subarray is " + totalMax);
    }

    public static void main(String[] args) {
        MaximumProductSubarray obj = new MaximumProductSubarray();
        int[] arr = { 1, -2, 0, -4, 8, -1 };
        obj.maximumProduct(arr);
    }
}

// The algorithm runs in linear time, 'O(n)', as it processes each array element
// once, performing constant-time operations per iteration.