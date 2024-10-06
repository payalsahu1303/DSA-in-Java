// Given a string S. The task is to print all unique permutations of the given string 
// that may contain dulplicates in lexicographically sorted order. 

import java.util.*;

public class PermutationsOfString {
    public List<String> permute(String str) {
        if (str.length() == 1) {
            List<String> result = new ArrayList<>();
            result.add(str);
            return result;
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            for (String p : permute(remaining)) {
                result.add(ch + p);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        PermutationsOfString obj = new PermutationsOfString();
        String str = "ABC";
        List<String> permutations = obj.permute(str);
        for (String p : permutations) {
            System.out.println(p);
        }
    }
}

// The algorithm generates all unique permutations of a string, which takes
// O(n*n!) time due to generating n! permutations and sorting them. It uses
// O(n*n!) space to store all permutations.
