//Question Link - https://leetcode.com/problems/all-paths-from-source-to-target/description/

class Solution {
    int[][] graph;
    List<List<Integer>> ans = new LinkedList<>();
    //using dfs to get all the paths
    public void dfs(List<Integer> path, int target){
        int last = path.get(path.size()-1);
        //base case
        if(last == target){
            ans.add(new ArrayList<Integer>(path));
            return;
        }
        
        for(int n: graph[last]){
            path.add(n);
            dfs(path, target);
            path.remove(path.size()-1);
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = this.ans;
        
        this.graph = graph;
        
        List<Integer> path = new ArrayList<>();
        
        path.add(0);
        dfs(path, graph.length-1);
        
        return ans;
    }
}
