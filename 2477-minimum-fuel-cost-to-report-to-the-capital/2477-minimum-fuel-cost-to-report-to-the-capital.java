class Solution {
    long ans = 0; 
    int s;
    
    private int dfs(int i, int prev, List<List<Integer>> list) {
        int count = 1;

        for (int x: list.get(i)) {
            if (x == prev) {
                continue;
            }
            count += dfs(x, i, list);
        }
        
        //base case
        if (i != 0) {
            ans += (count+s-1) / s;
        }
        
        return count;
    }

    public long minimumFuelCost(int[][] roads, int seats) {
        List<List<Integer>> adj = new ArrayList();
        this.s = seats;

        for (int i = 0; i < roads.length + 1; i++) {
            adj.add(new ArrayList());
        }
        for (int[] r: roads) {
            adj.get(r[0]).add(r[1]);
            adj.get(r[1]).add(r[0]);
        }

        dfs(0, 0, adj);
        
        return ans;
    }
}