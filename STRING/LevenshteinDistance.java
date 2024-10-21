// Given two strings str1 and str2. Return the minimum number of operations required to convert str1 to str2.
// The possible operations are permitted:
// Insert a character at any position of the string.
// Remove any character from the string.
// Replace any character from the string with any other character.

public class LevenshteinDistance {

    public int editDistance(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        LevenshteinDistance obj = new LevenshteinDistance();
        String str1 = "kitten";
        String str2 = "sitting";
        System.out.println(obj.editDistance(str1, str2));
    }
}

// The time complexity of the code is O(m * n) because it iterates over a 2D
// table of size (m+1) x (n+1). The space complexity is also O(m * n) due to the
// `dp` array used to store intermediate results.