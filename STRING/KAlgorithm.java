// Given two strings, one is a text string and the other is a pattern string. The task is to print the indexes of all the occurrences of the pattern string in the text string. For printing, Starting Index of a string should be taken as 1.

import java.util.ArrayList;

public class KAlgorithm {
    public ArrayList<Integer> algo(String Pat, String S) {
        int n = S.length();
        int m = Pat.length();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {
            if (S.substring(i, i + m).equals(Pat)) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        KAlgorithm obj = new KAlgorithm();
        String S = "batmanandrobinarebat";
        String Pat = "bat";
        System.out.println(obj.algo(Pat, S));
    }
}

// The time complexity of this code is O(n * m) because the `substring`
// method compares `m` characters for each position in the string `S`, iterating
// `n - m + 1` times. The space complexity is O(n) due to storing the result
// in an ArrayList.