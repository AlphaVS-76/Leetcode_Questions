//Question Link - https://leetcode.com/problems/range-sum-query-2d-immutable/

class NumMatrix {
    //using dp approach
    long[][] dp;
    public NumMatrix(int[][] matrix) {
        int y = matrix.length + 1;
        int x = matrix[0].length + 1;
        
        dp = new long[y][x];
        
        for (int i = 1; i < y; i++){
            for (int j = 1; j < x; j++){
                dp[i][j] = matrix[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int r1, int c1, int r2, int c2) {
        return (int)(dp[r2+1][c2+1] - dp[r2+1][c1] - dp[r1][c2+1] + dp[r1][c1]);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
