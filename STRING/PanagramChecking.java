// Given a string s check if it is "Panagram" or not.

import java.util.Arrays;

public class PanagramChecking {
    public boolean isPanagram(String str) {
        StringBuilder sb = new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        return sorted.equals(alpha);
    }

    public static void main(String[] args) {
        PanagramChecking obj = new PanagramChecking();
        String str = "qwert yuio pasd fghj k lzxc v bnm";
        System.out.println(obj.isPanagram(str));
    }
}

// The time complexity of the isPanagram method is O(n log n) due to sorting the
// character array, where n is the length of the input string. The space
// complexity is O(n) because of the additional StringBuilder and character
// array used for storage.
