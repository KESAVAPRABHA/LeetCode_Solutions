class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
                }
            }
        }
        return dp[m][n];
    }
}

// public class PatternMatchSpecialChars {

//     public static String findFirstMatch(String str, String pattern) {
//         for (int i = 0; i < str.length(); i++) {
//             String match = tryMatch(str.substring(i), pattern);
//             if (match != null) {
//                 return match;
//             }
//         }
//         return ""; // No match found
//     }

//     private static String tryMatch(String text, String pattern) {
//         int i = 0, j = 0;
//         int start = 0;
//         while (i < text.length() && j < pattern.length()) {
//             if (j + 1 < pattern.length() && (pattern.charAt(j + 1) == '*' || pattern.charAt(j + 1) == '+')) {
//                 char current = pattern.charAt(j);
//                 char quantifier = pattern.charAt(j + 1);
//                 int count = 0;
//                 while (i < text.length() && text.charAt(i) == current) {
//                     i++;
//                     count++;
//                 }
//                 if (quantifier == '+' && count == 0) {
//                     return null;
//                 }
//                 j += 2;
//             } else {
//                 if (text.charAt(i) != pattern.charAt(j)) {
//                     return null;
//                 }
//                 i++;
//                 j++;
//             }
//         }

//         // Check if pattern is exhausted
//         if (j == pattern.length()) {
//             return text.substring(start, i);
//         }

//         return null;
//     }

//     public static void main(String[] args) {
//         System.out.println(findFirstMatch("abcbbcabb", "cb*cab+"));   // Output: cbbcabb
//         System.out.println(findFirstMatch("abcbbactk", "bbk*ac+"));   // Output: bbac
//     }
// }
