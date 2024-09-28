// Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

import java.util.*;

public class SecondLargest {
    public int secLarge(int[] arr) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];

            }

        }
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;

    }

    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        int[] arr = { 4, 7, 10, 2, 5 };
        System.out.println(obj.secLarge(arr));
    }
}

// The time complexity of this algorithm is O(n), where n is the size of
// the array, as it iterates through the array once. The space complexity is
// O(1) since only a few variables are used regardless of input size.