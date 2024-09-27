
// Given an array arr of n positive integers, your task is to find all the leaders in the array.
// An element of the array is considered a leader if it is greater than all the elements on its 
// right side or if it is equal to the maximum element on its right side. 
// The rightmost element is always a leader.

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
    public List<Integer> leader(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        result.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[n - 1]) {
                arr[n - 1] = arr[i];
                result.add(arr[n - 1]);
            }
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i) + " ");
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayLeaders obj = new ArrayLeaders();
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        obj.leader(arr);
    }
}

// The algorithm finds array leaders in O(n) time by traversing from the
// end, comparing each element with the current maximum, and adding leaders to
// the result list in reverse order.