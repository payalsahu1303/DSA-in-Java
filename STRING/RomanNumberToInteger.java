// Given a string in roman no format (s)  your task is to convert it to an integer . 

public class RomanNumberToInteger {
    public int value(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        } else {
            return -1;
        }
    }

    public int roman(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));
                if (s1 >= s2) {
                    sum = sum + s1;
                } else {
                    sum = sum + (s2 - s1);
                    i++;
                }
            } else {
                sum = sum + s1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanNumberToInteger obj = new RomanNumberToInteger();
        String str = "XXII";
        System.out.println(obj.roman(str));
    }
}

// The time complexity is O(n) since each character in the Roman numeral is
// processed once. Space complexity is O(1) as only a few variables are used.
