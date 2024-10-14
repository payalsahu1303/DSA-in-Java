// Given two strings, one is a text string and the other is a pattern string. The task is to print the starting indexes of all the occurrences of the pattern string in the text string. For printing, the Starting Index of a string should be taken as 1. The strings will only contain lowercase English alphabets ('a' to 'z').

public class RabinKarpAlgorithm {
    public int search(String pattern, String text) {
        int result = pattern.indexOf(text);
        return result;
    }

    public static void main(String[] args) {
        RabinKarpAlgorithm obj = new RabinKarpAlgorithm();
        String pattern = "birthday";
        String text = "day";
        System.out.println(obj.search(pattern, text));
    }
}

// The time complexity of the provided code is O(n), where 'n' is the length
// of the pattern, due to `indexOf()`'s search operation. The space complexity
// is O(1) since no additional space grows with input size.