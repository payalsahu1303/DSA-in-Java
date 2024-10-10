// Given a string S, find the length of the longest substring with all distinct characters. 

import java.util.Arrays;
import java.util.HashSet;

public class LongestDistinctCharactersInString {
    public int longest(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        HashSet<Character> result = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < c.length; i++) {
            if (!result.contains(c[i])) {
                result.add(c[i]);
                c[idx++] = c[i];
            }
        }
        return idx;

    }

    public static void main(String[] args) {
        LongestDistinctCharactersInString obj = new LongestDistinctCharactersInString();
        String s = "aaabcdaa";
        System.out.println(obj.longest(s));
    }
}

// The time complexity of your code is O(n log n) due to sorting
// (`Arrays.sort()`). The space complexity is O(n) because of the `HashSet`
// storing distinct characters.
