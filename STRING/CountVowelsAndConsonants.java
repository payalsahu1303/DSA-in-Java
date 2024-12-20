// Count the number of vowels and consonants in a string.

public class CountVowelsAndConsonants {
    public void count(String str) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels : " + vowels + ", Consonants : " + consonants);
    }

    public static void main(String[] args) {
        CountVowelsAndConsonants obj = new CountVowelsAndConsonants();
        String str = "watermelon";
        obj.count(str);
    }
}

// The time complexity of the code is O(n) due to the single loop iterating
// through the string of length 'n'. The space complexity is O(1) since
// only a constant amount of extra space is used for variables.
