//Question Link - https://leetcode.com/problems/transpose-matrix/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] newMatrix = new int[c][r];
        
        //base case
        if(matrix.length == 1 && matrix[0].length == 1){
            return matrix;
        }
        
        //newMatrix has the transposed position for the same elements
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }
        
        return newMatrix;
    }
}
