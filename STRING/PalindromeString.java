// Given a string S, check if it is palindrome or not.

public class PalindromeString {
    public boolean isPalindrome(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        PalindromeString obj = new PalindromeString();
        String s1 = "madam";
        String s2 = "hello";
        System.out.println(obj.isPalindrome(s1));
        System.out.println(obj.isPalindrome(s2));
    }
}

// The time complexity of this code is O(n) because of iteration used to get the
// reverse word.
