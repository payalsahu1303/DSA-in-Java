// Given a string str, find the longest palindromic substring in str. Substring of string str: str[ i . . . . j ] where 0 ≤ i ≤ j < len(str). Return the longest palindromic substring of str.

public class LongestPalindromeInAString {
    public String longestPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int start = 0;
        int maxLen = 1;
        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        return str.substring(start, start + maxLen);
    }

    int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromeInAString obj = new LongestPalindromeInAString();
        String str = "aaaabbaa";
        System.out.println(obj.longestPalindrome(str));
    }
}

// The time complexity of this approach is O(n²) because for each character
// in the string, the `expandAroundCenter` function expands up to the full
// length of the string. The space complexity is O(1), as only a few variables
// are used.