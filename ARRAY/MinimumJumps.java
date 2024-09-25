// Given an array arr[] of non-negative integers. Each array element represents the maximum length of the jumps that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x. Find the minimum number of jumps to reach the end of the array starting from the first element. If an element is 0, then you cannot move through that element.

public class MinimumJumps {
    public int minJumps(int[] arr) {
        int jumps = 0;
        int maxReach = arr[0];
        int steps = arr[0];
        if (arr[0] == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length) {
                return jumps;
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxReach) {
                    return -1;
                }
                steps = maxReach - i;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        MinimumJumps obj = new MinimumJumps();
        int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(obj.minJumps(arr));
    }
}

// The algorithm computes minimum jumps in **O(n)** by tracking maximum reach
// and steps, updating jumps when steps reach zero.