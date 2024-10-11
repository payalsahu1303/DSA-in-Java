// Given an array of n names arr of candidates in an election, where each name is a string of lowercase characters. A candidate name in the array represents a vote casted to the candidate. Print the name of the candidate that received the maximum count of votes. If there is a draw between two candidates, then print lexicographically smaller name.

import java.util.HashMap;

public class WinnerOfAnElection {
    public String findWinner(String[] arr, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        String max = "";
        int maxCount = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > maxCount) {
                max = key;
                maxCount = map.get(key);
            } else if (map.get(key) == maxCount && key.compareTo(max) < 0) {
                max = key;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        WinnerOfAnElection obj = new WinnerOfAnElection();
        String[] arr = { "john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny",
                "jamie", "johnny", "john" };
        int n = arr.length;
        System.out.println(obj.findWinner(arr, n));
    }
}

// The time complexity is O(n) due to iterating over the array and the map.
// The space complexity is O(m), where m is the number of unique
// candidates.