class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] re, int[][] be) {
        //make an adjacency list
        ArrayList<ArrayList<int[]>> adj  = new ArrayList<>();
        for(int i=0 ; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i[] : re) {
            adj.get(i[0]).add(new int[]{i[1], 1});
        }
        for(int i[] : be) {
            adj.get(i[0]).add(new int[]{i[1], 0});
        }
        
        int res[] = new int[n];
        Arrays.fill(res, (int)1e9);
        boolean isVis[][] = new boolean[n][2];
        Queue<int[]> q = new LinkedList<>();
        
        isVis[0][0] = true;
        isVis[0][0] = true;
        q.add(new int[]{0, 0, 0});
        q.add(new int[]{0, 1, 0});
        
        while(!q.isEmpty()){
            int curr[] = q.poll();
            int node = curr[0];
            int isRed = curr[1];
            int dist = curr[2];
            
            if(res[node] > dist) {
                res[node] = dist;
            }
            for(int c[] : adj.get(node)){
                if(isRed==1 && c[1]==0 && !isVis[c[0]][1]){
                    isVis[c[0]][1] = true;
                    q.add(new int[]{c[0], 0, dist+1});
                }
                
                if(isRed==0 && c[1]==1 && !isVis[c[0]][0]){
                    isVis[c[0]][0] = true;
                    q.add(new int[]{c[0], 1, dist+1});
                }
            }
        }

        for(int i=0 ; i<n ; i++){
            if(res[i] == (int)1e9) res[i] = -1;
        }

        return res;
    }
}