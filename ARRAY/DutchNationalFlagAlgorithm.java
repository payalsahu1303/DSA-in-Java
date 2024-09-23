// Given an array A[] consisting of only 0s, 1s, and 2s. The task is to sort the array, i.e. put all 0s first, then all 1s, and all 2s in last

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    public void sorting(int[] A) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                c0 = c0 + 1;
            } else if (A[i] == 1) {
                c1 = c1 + 1;
            } else {
                c2 = c2 + 1;
            }
        }
        int id = 0;
        for (int i = 0; i < c0; i++) {
            A[id++] = 0;
        }
        for (int i = 0; i < c1; i++) {
            A[id++] = 1;
        }
        for (int i = 0; i < c2; i++) {
            A[id++] = 2;
        }
        System.out.println("The sorted array is : ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        DutchNationalFlagAlgorithm d = new DutchNationalFlagAlgorithm();
        int[] A = { 1, 2, 0, 2, 2, 0, 1, 0, 1, 2 };
        d.sorting(A);
    }
}

// The algorithm sorts the array in O(n) time by counting occurrences and
// then reconstructing the array with 0s, 1s, and 2s.
// The space complexity is O(1).