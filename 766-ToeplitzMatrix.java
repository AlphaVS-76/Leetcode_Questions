//Question Link - https://leetcode.com/problems/toeplitz-matrix/

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        
        for(int i=1 ; i<n ; i++){
            for(int j=1 ; j<matrix[i].length ; j++){
                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
