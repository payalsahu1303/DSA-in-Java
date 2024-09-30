// Given a positive integer k and an array arr[] denoting heights of towers, you have to modify the height of each tower either by increasing or decreasing them by k only once.
// Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.

import java.util.Arrays;

public class MinimizetheHeightsI {
    public void minHeight(int[] arr, int k) {
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + k;
            } else {
                arr[i] = arr[i] - k;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max - min);
    }

    public static void main(String[] args) {
        MinimizetheHeightsI obj = new MinimizetheHeightsI();
        int[] arr = { 1, 3, 8, 7, 9 };
        int k = 2;
        obj.minHeight(arr, k);
    }
}

// Time complexity is O(n log n) due to sorting; space complexity is O(1) since
// modifications are in-place.