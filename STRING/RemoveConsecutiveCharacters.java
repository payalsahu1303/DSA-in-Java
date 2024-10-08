// Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

public class RemoveConsecutiveCharacters {
    public String removeChar(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {

            if (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveConsecutiveCharacters obj = new RemoveConsecutiveCharacters();
        String str = "aabbcd";
        System.out.println(obj.removeChar(str));
    }
}

// Time complexity is O(n) because each character is processed once, and
// space complexity is O(n) due to the 'StringBuilder' holding a copy of the
// input string.