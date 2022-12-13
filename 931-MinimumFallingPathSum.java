//Question case - https://leetcode.com/problems/minimum-falling-path-sum/description/

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        //init the dp with the first row of matrix for top-down approach
        dp[0] = matrix[0];

        for(int i = 1 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                //edge case
                if(j == 0){
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j+1]);
                }
                else if(j == n-1){
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j-1]);
                }
                //if the el is in between, we take min of all 3 possibilities
                else{
                    dp[i][j] = matrix[i][j] + Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]), dp[i-1][j+1]);
                }
            }
        }

        //the smallest element in the last row contains the min path
        Arrays.sort(dp[n-1]);
        return dp[n-1][0];
    }
}
