//Question Link - https://leetcode.com/problems/russian-doll-envelopes/

class Solution {
    //similar to LIC problem
    public int maxEnvelopes(int[][] envelopes) {
        //base case
        if(envelopes.length == 1){
            return 1;
        }
        
        //sorting the array
        Arrays.sort(envelopes, (arr1, arr2) -> {
            if(arr1[0] == arr2[0]){
                return arr2[1] - arr1[1];
            }
            else{
                return arr1[0] - arr2[0];
            }
        });
        
        //using dp approach
        int dp[] = new int[envelopes.length];
        int len = 0;
        
        for(int[] e : envelopes){
            int i = Arrays.binarySearch(dp, 0, len, e[1]);
            
            if(i < 0){
                i = -(i + 1);
            }
            
            dp[i] = e[1];
            
            if(i == len){
                len++;
            }
        }
        
        return len;
    }
}
