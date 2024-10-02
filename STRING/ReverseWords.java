// Given a String str, reverse the string without reversing its individual words. Words are separated by dots. Note: The last character has not been '.'. 

public class ReverseWords {
    public String reverseWords(String str) {
        String[] words = str.split("\\.");
        StringBuilder s_Builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            s_Builder.append(words[i]);
            if (i != 0) {
                s_Builder.append(".");
            }
        }
        return s_Builder.toString();
    }

    public static void main(String[] args) {
        ReverseWords obj = new ReverseWords();
        String str = "i.like.this.program.very.much";
        System.out.println(obj.reverseWords(str));
    }
}

// The time complexity of this code is O(n), where 'n' is the length of
// the input string, due to the split operation and the iteration through words.
// The space complexity is also O(n) since the array of words and the
// StringBuilder store the same total number of characters as the input string.