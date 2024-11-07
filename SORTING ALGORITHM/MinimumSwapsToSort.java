// Given an array arr[] of distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.

import java.util.Arrays;

public class MinimumSwapsToSort {
    public int minSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        int[][] arrPos = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrPos[i][0] = arr[i];
            arrPos[i][1] = i;
        }

        Arrays.sort(arrPos, (a, b) -> Integer.compare(a[0], b[0]));

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] || arrPos[i][1] == i)
                continue;

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arrPos[j][1];
                cycleSize++;
            }
            swaps += (cycleSize - 1);
        }
        return swaps;
    }

    public static void main(String[] args) {
        MinimumSwapsToSort obj = new MinimumSwapsToSort();
        int[] arr = { 2, 4, 5, 1, 8, 9 };
        System.out.println(obj.minSwaps(arr));
    }
}
