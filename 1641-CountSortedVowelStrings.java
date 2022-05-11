//Question Link - https://leetcode.com/problems/count-sorted-vowel-strings/

class Solution {
    public int countVowelStrings(int n) {
        //base case
        if(n == 0){
            return 0;
        }
        
        //approach used: dp
        int[] dp = {0, 1, 1, 1, 1, 1};
        
        for (int i = 1; i <= n; ++i){
            for (int k = 1; k <= 5; ++k){
                dp[k] += dp[k - 1];
            }
        }
        
        return dp[5];
    }
}
