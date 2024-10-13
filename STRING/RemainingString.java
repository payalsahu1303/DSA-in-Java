// Given a string s without spaces, a character ch and an integer count. Your task is to return the substring that remains after the character ch has appeared count number of times.

public class RemainingString {
    public String remaining(String str, char ch, int count) {
        StringBuilder sb = new StringBuilder();
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count1++;
                if (count1 == count) {
                    sb.append(str.substring(i + 1, str.length()));
                    break;
                } else {
                    return "Empty String";
                }
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemainingString obj = new RemainingString();
        String str = "thisisdemostring";
        char ch = 'd';
        int count = 1;
        System.out.println(obj.remaining(str, ch, count));
    }
}

// The time complexity of the code is O(n), where `n` is the length of the
// string. The space complexity is O(n) due to the use of `StringBuilder`.
