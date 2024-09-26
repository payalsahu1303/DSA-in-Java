// Given an array arr of size n which contains elements in range from 0 to n-1,
// you need to find all the elements occurring more than once in the given
// array. If no such element is found,
// return list containing [-1].

import java.util.ArrayList;
import java.util.List;

public class ArrayDuplicates {
    public List<Integer> duplicate(int[] arr) {
        int n = arr.length;
        boolean[] visit = new boolean[n];
        List<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (visit[arr[i]]) {
                if (!duplicate.contains(arr[i])) {
                    duplicate.add(arr[i]);
                }
            } else {
                visit[arr[i]] = true;
            }
        }
        if (duplicate.isEmpty()) {
            duplicate.add(-1);
        }
        return duplicate;
    }

    public static void main(String[] args) {
        ArrayDuplicates obj = new ArrayDuplicates();
        int[] arr = { 1, 0, 4, 2, 3, 1, 5, 4 };
        List<Integer> result = obj.duplicate(arr);
        System.out.println(result);
    }
}

// The algorithm runs in O(n) time and uses O(n) space, as it tracks duplicates
// with a boolean array and a list.