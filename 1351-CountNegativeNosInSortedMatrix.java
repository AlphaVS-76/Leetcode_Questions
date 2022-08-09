//Question Link - https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

class Solution {
    public int countNegatives(int[][] grid) {
        int neg = 0;
        
        //count the negative nos. in the matrix
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] < 0){
                    neg++;
                }
            }
        }
        
        return neg;
    }
}
