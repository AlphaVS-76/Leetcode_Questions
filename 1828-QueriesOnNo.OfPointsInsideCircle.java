//Question Link - https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        
        for(int i = 0 ; i < queries.length ; i++) {
            for(int j = 0 ; j < points.length ; j++) {
                //applying the formula (euclidian formula)
                if(queries[i][2] >= Math.sqrt(Math.pow(points[j][0] - queries[i][0],2) + Math.pow(points[j][1] - queries[i][1],2)))
                    ans[i]++;
            }
        }
        
        return ans;
    }
}
