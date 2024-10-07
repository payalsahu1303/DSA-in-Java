// Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. 
// If there is no non-repeating character, return '$'.

import java.util.HashMap;

public class NonRepeatingCharacter {
    public char isNonRepeating(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        NonRepeatingCharacter obj = new NonRepeatingCharacter();
        String str = "aabcedab";
        System.out.println(obj.isNonRepeating(str));
    }
}

// The time complexity is O(n) due to two traversals of the string.
// Space complexity is O(1), as the HashMap stores at most 26 characters'
// frequencies.
