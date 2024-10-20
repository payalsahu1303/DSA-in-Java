// Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

public class ExceptionallyOdd {
    public int findExceptionalNumber(int[] arr, int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            count ^= arr[i];
        }

        return count;
    }

    public static void main(String[] args) {
        ExceptionallyOdd obj = new ExceptionallyOdd();
        int[] arr = { 2, 3, 4, 5, 5, 2, 4, 3, 5, 5, 2 };
        int N = arr.length;
        int result = obj.findExceptionalNumber(arr, N);
        System.out.println("Exceptional Number is: " + result);
    }
}

// The time complexity of the code is O(N) due to the single loop iterating over
// the array, and the space complexity is O(1) as it uses constant extra space.