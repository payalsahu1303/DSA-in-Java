// Given a sentence containing several words and numbers. Find the largest number among them which does not contain 9. If no such number exists, return -1.

public class ExtractNumberFromString {
    public long findLargestNumber(String str) {
        String[] words = str.split("\\s+");
        long max = -1;
        for (String word : words) {
            if (word.matches("\\d+")) {
                int index = word.indexOf('9');
                if (index == -1) {
                    max = Math.max(max, Long.parseLong(word));
                } else {
                    return -1;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ExtractNumberFromString obj = new ExtractNumberFromString();
        String str = "I have 100 apples and 10 oranges";
        System.out.println(obj.findLargestNumber(str));
    }
}

// The time complexity is O(n), where `n` is the length of the input string,
// since it splits and processes each word. The space complexity is O(n),
// due to the space needed for storing the split words.