//Question  link - https://leetcode.com/problems/unique-paths-iii/description/

class Solution {
    int zeroes = 1;
    int totalPath = 0;

    void dfs(int[][] grid, int x, int y){
        //base case
        if(x<0 || x>=grid.length || y<0 || y>= grid[0].length || grid[x][y] <0){
            return;
        }
        if(grid[x][y] == 2){
            if(zeroes == 0) totalPath++;
            return;
        }

        grid[x][y] = -2;
        zeroes--;

        dfs(grid, x+1, y);
        dfs(grid, x-1, y);
        dfs(grid, x, y+1);
        dfs(grid, x, y-1);
        
        grid[x][y] = 0;
        zeroes++;
    }

    public int uniquePathsIII(int[][] grid) {
        int sr = 0, sc = 0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 0){
                    zeroes++;
                }
                else if(grid[i][j] == 1){
                    sr = i;
                    sc = j;
                }
            }
        }

        dfs(grid, sr, sc);
        
        return totalPath;
    }
}
