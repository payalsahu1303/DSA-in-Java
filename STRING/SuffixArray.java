// Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.

public class SuffixArray {
    public int longestPrefixSuffix(String s) {
        int n = s.length();
        int[] pi = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                pi[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = pi[len - 1];
                } else {
                    pi[i] = 0;
                    i++;
                }
            }
        }
        return pi[n - 1];
    }

    public static void main(String[] args) {
        SuffixArray obj = new SuffixArray();
        String s = "ababcabab";
        System.out.println(obj.longestPrefixSuffix(s));
    }
}

// The time complexity of the `longestPrefixSuffix` method is O(n) because
// it processes each character in the string once. The space complexity is
// O(n) due to the auxiliary array `pi` used to store prefix values.
