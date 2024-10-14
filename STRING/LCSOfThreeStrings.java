// Given 3 strings A, B and C, the task is to find the length of the longest sub-sequence that is common in all the three given strings.

public class LCSOfThreeStrings {
    public int findLCS(String A, String B, String C) {
        if (B.contains(A) && C.contains(A)) {
            return A.length();
        } else if (A.contains(B) && C.contains(B)) {
            return B.length();
        } else if (A.contains(C) && B.contains(C)) {
            return C.length();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        LCSOfThreeStrings obj = new LCSOfThreeStrings();
        String A = "applepie";
        String B = "apple";
        String C = "pineapple";
        System.out.println(obj.findLCS(A, B, C));
    }
}

// The time complexity of the code is O(n * m), where `n` and `m` are the
// lengths of the strings. Space complexity is O(1) as no extra space is
// used.
