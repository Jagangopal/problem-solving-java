package com.dp.problems;

public class LongestCommonSubsequence {
    /**
     * Time Complexity: O(M * N)
     * Space Complexity: O(M * N)
     * @param s1
     * @param s2
     * @return
     */
    public static int lcs(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m;i++){
            for(int j = 1; j <= n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i - 1][ j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    /**
     * Input: s1 = "ABC", s2 = "ACD"
     * Output: 2
     * Explanation: The longest subsequence which is present in both strings is "AC".
     *
     * Input: s1 = "AGGTAB", s2 = "GXTXAYB"
     * Output: 4
     * Explanation: The longest common subsequence is "GTAB".
     *
     * Input: s1 = "ABC", s2 = "CBA"
     * Output: 1
     * Explanation: There are three longest common subsequences of length 1, "A", "B" and "C".
     * @param args
     */
    public static void main(String[] args)
    {
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        System.out.println( lcs(S1, S2));
    }
}
