// Given two strings A and B consisting of lowercase english characters. Find the characters that are not common in the two strings.
// Return the string in sorted order.

import java.util.Arrays;

public class UncommonCharacters {
    public String uncommonChar(String A, String B) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if (B.indexOf(A.charAt(i)) == -1 && res.indexOf(String.valueOf(A.charAt(i))) == -1) {
                res.append(A.charAt(i));
            }
        }
        for (int i = 0; i < B.length(); i++) {
            if (A.indexOf(B.charAt(i)) == -1 && res.indexOf(String.valueOf(B.charAt(i))) == -1) {
                res.append(B.charAt(i));
            }
        }
        if (res.length() > 0) {
            char[] result = res.toString().toCharArray();
            Arrays.sort(result);
            return new String(result);
        }

        return "-1";
    }

    public static void main(String[] args) {
        UncommonCharacters obj = new UncommonCharacters();
        String A = "characters";
        String B = "alphabets";
        System.out.println(obj.uncommonChar(A, B));
    }
}

// Time complexity is O(n*m) due to nested `indexOf()` checks for uncommon
// character.
// Space complexity is O(k), where k is the uncommon characters' count.