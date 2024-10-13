// Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.
// Two strings are called K-anagrams if both of the below conditions are true.
// 1. Both have same number of characters.
// 2. Two strings can become anagram by changing at most K characters in a string.

public class CheckIfTwoStringsAreKAnagramsOrNot {
    public boolean checkKAnagrams(String s1, String s2, int k) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        if (count == k) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfTwoStringsAreKAnagramsOrNot obj = new CheckIfTwoStringsAreKAnagramsOrNot();
        String s1 = "fodr";
        String s2 = "gode";
        int k = 2;
        System.out.println(obj.checkKAnagrams(s1, s2, k));
    }
}

// The time complexity of this code is O(n) due to the single loop that
// checks the characters of the two strings. The space complexity is O(1)
// since no additional space is used aside from a few variables.