//Question Link - https://leetcode.com/problems/longest-common-subsequence/description/

class Solution {
    public int rec(String text1, int m, String text2, int n, int[][] dp) {
        //base case
        if(m == 0 || n == 0){
            return dp[m][n] = 0;
        }
        //if its already visited return the length
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        //the next cell keeps the len of prev subseq
        if(text1.charAt(m-1) == text2.charAt(n-1)){
            return dp[m][n] = 1 + rec(text1, m-1, text2, n-1, dp);
        }

        return dp[m][n] = Math.max(rec(text1, m-1, text2, n, dp), rec(text1, m, text2, n-1, dp));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        //base case
        if(text1.equals(text2)){
            return text1.length();
        }

        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        //indicate every cell as unvisited
        for(int[] a: dp) {
            Arrays.fill(a, -1);
        }

        return rec(text1, m, text2, n, dp);
    }
}
