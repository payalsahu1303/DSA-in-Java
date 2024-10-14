// Given two strings, one is a text string, txt and the other is a pattern string, pat. The task is to print the indexes of all the occurrences of pattern string in the text string. Use one-based indexing while returning the indices. 

import java.util.ArrayList;
import java.util.List;

public class KMPAlgorithm {
    public List<Integer> search(String pat, String txt) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            if (txt.substring(i, i + pat.length()).equals(pat)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        KMPAlgorithm obj = new KMPAlgorithm();
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABAB";
        System.out.println(obj.search(pat, txt));
    }
}

// This code performs a brute-force substring search, not KMP. The time
// complexity is O(n * m) where 'n' is the text length and 'm' is the
// pattern length, due to substring comparison in each iteration. The space
// complexity is O(n) for storing the result list.