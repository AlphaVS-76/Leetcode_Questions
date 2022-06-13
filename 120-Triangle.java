//Question Link - https://leetcode.com/problems/triangle/

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //base case
        if(triangle.size() == 1){
            return triangle.get(0).get(0);
        }
        
        int size = triangle.size();
        int[] dp = new int[size];
        dp[0] = triangle.get(0).get(0);

        for(int i=1; i<size; i++){
            List<Integer> list = triangle.get(i);
            int prev = dp[0];
            dp[0] += list.get(0);

            //calculating minimum path sum for ith level
            for(int j=1 ; j<i ; j++){
                int temp = dp[j];
                dp[j] = list.get(j) + Math.min(prev, dp[j]);
                prev = temp;
            }

            dp[i] = prev + list.get(i);
        }

        //dp contains the min path sum
        int ans = dp[0];
        for(int i=1; i<size; i++){
            ans = Math.min(ans, dp[i]);
        }

        return ans;
    }
}
