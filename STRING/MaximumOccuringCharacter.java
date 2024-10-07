// Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str. 

import java.util.HashMap;

public class MaximumOccuringCharacter {
    public char maxOccure(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) > 1) {
                return str.charAt(i);
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        MaximumOccuringCharacter obj = new MaximumOccuringCharacter();
        String str = "output";
        System.out.println(obj.maxOccure(str));
    }
}

// Time complexity is O(n) due to two traversals of the string. Space
// complexity is O(1), as the hashmap stores up to 26 lowercase letters only.