// Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. If the conversion is not feasible, the function should return -1.
// Note: Conversion is feasible only if all characters in the string are numeric or if its first character is '-' or '+' and rest are numeric.

public class ImplementAtoi {
    public int atoi(String s) {
        int num = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                sign = -1;
            } else if (c == '+') {
                // Do nothing
            } else if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } else {
                return -1;
            }
        }
        return num * sign;
    }

    public static void main(String[] args) {
        ImplementAtoi obj = new ImplementAtoi();
        String s = "1255";
        System.out.println(obj.atoi(s));
    }
}

// The time complexity of the atoi method is O(n), where n is the length
// of the input string, as it processes each character once. The space
// complexity is O(1) since no extra space is used besides a few variables
// (num, sign).