// Given two strings a and b consisting of lowercase characters. 
// The task is to check whether two given strings are an anagram of each other or not. 
// An anagram of a string is another string that contains the same characters, only the order of characters can be different. 

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] ch = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        return Arrays.equals(ch, ch2);
    }

    public static void main(String[] args) {
        Anagram obj = new Anagram();
        String str = "listen";
        String str2 = "silent";
        System.out.println(obj.isAnagram(str, str2));
    }
}

// The time complexity of the above code is O(n log n) due to sorting the
// two strings. The space complexity is O(n) because of the additional arrays
// created for sorting the characters of the input strings.