//Question Link - https://leetcode.com/problems/coin-change/

class Solution {
    public int coinChange(int[] coins, int amount) {
        //base case
        if(amount == 0){
            return 0;
        }
        
        //using dp
        int[] dp = new int[amount + 1];

        for (int i=1 ; i < dp.length ; i++) {
            dp[i] = dp.length;

            for (int j=0 ; j < coins.length ; j++) {
                if (i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
                }
            }
        }

        if(dp[amount] == dp.length){
            return -1;
        }
        else{
            return dp[amount];
        }
    }
}
