//Question Link - https://leetcode.com/problems/find-center-of-star-graph/

class Solution {
    public int findCenter(int[][] edges) {
        int[] pair = new int[2];
        //both counts are for the pairs
        int c1 = 0;
        int c2 = 0;
        pair[0] = edges[0][0];
        pair[1] = edges[0][1];
        
        //compare the pair to other edges, increase counts if matched
        for(int i = 1 ; i < edges.length ; i++){
            if(edges[i][0] == pair[0]){
                c1++;
            }
            if(edges[i][1] == pair[1]){
                c2++;
            }
        }
        
        if(c1 >= c2){
            return pair[0];
        }
        else{
            return pair[1];
        }
    }
}
