//Question Link - https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        
        //a loop which gets element from start and from end
        for(int i = 0; i < n; i++){
            sum += mat[i][i] + mat[i][n-i -1];
        }
        
        //if order is odd, remove the middle element from sum
        //if order is even, return as is
        if(n % 2 != 0){
            sum -= mat[n/2][n/2];
        }
        
        return sum;
    }
}
