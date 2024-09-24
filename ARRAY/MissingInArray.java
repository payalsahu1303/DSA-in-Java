// Given an array arr of size n−1 that contains distinct integers in the range of 1 to n (inclusive),
// find the missing element. The array is a permutation of size n with one element missing. Return the missing element.

import java.util.Arrays;

public class MissingInArray {
    public void missingArray(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 == arr[i]) {
                count++;
            } else {
                count = count + 1;
                System.out.println("The missing number in an array is : " + count);
                break;

            }
        }
    }

    public static void main(String[] args) {
        MissingInArray obj = new MissingInArray();
        int[] arr = { 1, 2, 3, 5, 6 };
        int n = 5;
        obj.missingArray(arr, n);
    }
}

// The code has a time complexity of O(n), iterating through the array once.
// The space complexity is O(1), using minimal auxiliary space.
