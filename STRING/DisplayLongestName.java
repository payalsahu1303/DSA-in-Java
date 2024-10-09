// Given a list of names, display the longest name. If there are multiple names of the longest size, return the first occurring name.

public class DisplayLongestName {
    public String longest(String[] str) {
        String longest = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > longest.length()) {
                longest = str[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        DisplayLongestName obj = new DisplayLongestName();
        String[] str = { "apple", "mango", "coconut", "strawberry" };
        System.out.println(obj.longest(str));
    }
}

// The time complexity is O(n) since the array is traversed once, and the
// space complexity is O(1) as no extra space is used except for variables.