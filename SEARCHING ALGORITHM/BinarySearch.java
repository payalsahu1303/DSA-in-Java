// Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

public class BinarySearch {
    public int search(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k)
                return mid;
            if (arr[mid] < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] arr = { 1, 2, 3, 5, 9, 10 };
        int k = 10;
        int result = obj.search(arr, k);
        System.out.println(result);

    }
}

// The time complexity is O(log n), as the search space halves each iteration.
// The space complexity is O(1) since it uses only a fixed amount of extra
// space.