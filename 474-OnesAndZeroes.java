//Question Link - https://leetcode.com/problems/ones-and-zeroes/

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        //base case
        if(strs.length == 1){
            return 1;
        }
        //using dp to store the results 
        Integer[][][] dp = new Integer[m+1][n+1][strs.length+1];
        
        return rec(strs, m, n, strs.length, dp);    
    }
    
    public int rec(String[] strs, int m, int n, int i, Integer[][][] dp){
        //base case
        if(i==0 || (m==0 && n==0)){
            return 0;
        }
        if(dp[m][n][i] != null){
            return dp[m][n][i];
        }
        
        int a = count(strs[i-1]);
        int b = strs[i-1].length()-a;
        int ans;
        
        if(m>=a && n>=b){
            ans = Math.max(1 + rec(strs, m-a, n-b, i-1, dp) , rec(strs, m, n, i-1, dp));
        }
        else{
            ans = rec(strs, m, n, i-1, dp);
        }
        
        dp[m][n][i] = Integer.valueOf(ans);
        
        return dp[m][n][i];
    }
    
    //counting the num of 0 in an element
    public int count(String s){
        int cnt = 0;
        
        for(char c: s.toCharArray()){
            if(c == '0'){
                cnt++;
            }
        }
        
        return cnt;
    }
}
