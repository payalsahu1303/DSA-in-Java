// Given an array arr. Find the majority element in the array. If no majority exists, return -1.
// A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

public class MooreVotingAlgorithm {
    public void majority(int[] arr) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        if (isMajority(arr, candidate)) {
            System.out.println(candidate);
        } else {
            System.out.println(-1);
        }

    }

    public boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }

    public static void main(String[] args) {
        MooreVotingAlgorithm obj = new MooreVotingAlgorithm();
        int[] arr = { 1, 3, 3, 5, 3, 3 };
        obj.majority(arr);
    }
}

// The time complexity of the code is O(n), where n is the length of the input
// array, and the space complexity is O(1), as it uses a constant amount of
// space to store variables.
