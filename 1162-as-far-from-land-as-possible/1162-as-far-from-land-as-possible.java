class Solution {
    public int maxDistance(int[][] grid) {
        //base case
        if(grid.length==1 && grid[0].length==1){
            return -1;
        }

        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        int count = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j] == 1){
                    q.offer(new int[]{i, j});
                }
            }
        }
                
        while(q.size() > 0){
            int s = q.size();
            
            while(s > 0){
                int[] curr = q.poll();
                for(int i=0 ; i<4 ; i++){
                    int distx = curr[0]+dx[i];
                    int disty = curr[1]+dy[i];
                    
                    if(distx>=0 && disty>=0 && distx<n && disty<n && grid[distx][disty]==0){
                        q.offer(new int[]{distx, disty});
                        grid[distx][disty] = 1;
                    }
                }
                s--;
            }

            count++;
        }

        return count==1?-1:count-1;
    }
}