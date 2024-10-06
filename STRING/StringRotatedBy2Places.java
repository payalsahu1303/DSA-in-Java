// Given two strings a and b. The task is to find if the string 'b' 
// can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

public class StringRotatedBy2Places {
    public boolean isRotate(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        String leftRotate = a.substring(2) + a.substring(0, 2);
        String rightRotate = a.substring(a.length() - 2) + a.substring(0, a.length() - 2);
        return b.equals(leftRotate) || b.equals(rightRotate);
    }

    public static void main(String[] args) {
        StringRotatedBy2Places obj = new StringRotatedBy2Places();
        System.out.println(obj.isRotate("AABBC", "BBCAA"));
    }
}

// The time complexity is O(n) due to substring and comparison operations.
// The space complexity is also O(n) since two new strings are created.