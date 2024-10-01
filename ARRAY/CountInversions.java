// Given an array of integers. Find the Inversion Count in the array.  Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

public class CountInversions {
    public void inversion(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("Inversion count is " + count);
    }

    public static void main(String[] args) {
        CountInversions obj = new CountInversions();
        int[] arr = { 1, 3, 5, 2, 4, 6 };
        obj.inversion(arr);
    }
}

// The time complexity is O(n²) due to the nested loops, where each pair of
// elements is compared for inversion.