class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int[][] ans = new int[grid.length][grid[0].length];

        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                ans[i][j] = calc(grid, i, j);
            }
        }

        return ans;   
    }

    public int calc(int[][] arr, int i, int j){
        int r1 = i, r2 = i, c1 = j, c2 = j;
        HashSet<Integer> set1 = new HashSet(); 
        HashSet<Integer> set2 = new HashSet();
        
        while(r1>0 && c1>0){
            set1.add(arr[--r1][--c1]);
        }
        
        while(r2 < arr.length-1 && c2 < arr[0].length-1){
            set2.add(arr[++r2][++c2]);
        }

        return Math.abs(set1.size()-set2.size());
    }
}