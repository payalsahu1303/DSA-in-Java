// Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.

import java.io.*;
import java.util.*;

public class IsomorphicStrings {
    int size = 256;
    public String areIsomorphic(String str1, String str2)
    {
        int m = str1.length();
        int n = str2.length();
        if (m != n)
            return "False";

        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);

        int[] map = new int[size];
        Arrays.fill(map, -1);

        for (int i = 0; i < n; i++) {
            if (map[str1.charAt(i)] == -1) {
                if (marked[str2.charAt(i)] == true)
                    return "False";
                marked[str2.charAt(i)] = true;
                map[str1.charAt(i)] = str2.charAt(i);
            }
            else if (map[str1.charAt(i)] != str2.charAt(i))
                return "False";
        }

        return "True";
    }
    public static void main(String[] args){
      IsomorphicStrings obj = new IsomorphicStrings();
      String str1 = "aab";
      String str2 = "xxy";
      System.out.println(obj.areIsomorphic(str1, str2));
    }
}

// The time complexity is O(n), where n is the length of the strings, as each character is processed once. The space complexity is O(1) because the space used is constant (arrays of size 256), regardless of input size.
