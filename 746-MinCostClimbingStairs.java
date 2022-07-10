//Question Link - https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //using dp (memoization)
        int[] dp = new int[cost.length+1];
        
        dp[0] = 0;
        dp[1] = 0;
      
        for (int i = 2; i <= cost.length; ++i) {
            //this calculates the total steps taken for each element
            //and stores the min value of it
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }
        
        return dp[cost.length];
    }
}
