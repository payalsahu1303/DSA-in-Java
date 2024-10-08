public class RepeatedCharacter {
    public char findRepeat(String str) {
        char c;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    c = str.charAt(i);
                    return c;
                }
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        RepeatedCharacter obj = new RepeatedCharacter();
        String str = "remember";
        System.out.println(obj.findRepeat(str));
    }
}

// The time complexity is O(n²) due to the nested loops checking all
// character pairs. The space complexity is O(1) since no extra space is
// used beyond the input string.