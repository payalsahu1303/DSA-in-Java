// You are given a string s. You need to reverse the string.

public class ReverseAString {
    public String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        ReverseAString obj = new ReverseAString();
        String s = "Hello World";
        System.out.println(obj.reverse(s));
    }
}

// The time complexity is O(n) due to string concatenation inside the loop,
// which takes O(n) for each of the n iterations. The space complexity is O(1)
// for storing the reversed string.