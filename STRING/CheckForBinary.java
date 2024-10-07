// Given a non-empty sequence of characters str, return true if sequence is Binary, else return false

public class CheckForBinary {
    public String isBinary(String str) {
        String result = "false";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                result = "false";
                break;
            } else {
                result = "true";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CheckForBinary obj = new CheckForBinary();
        String str = "10110";
        System.out.println(obj.isBinary(str));
    }
}

// The time complexity is O(n), where n is the length of the string, as each
// character is checked once. The space complexity is O(1), requiring
// constant space.