//Question Link - https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums){
        int[] ans = new int[2*nums.length];
        
        //for first half of the ans array
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[i];
        }
        
        int a = 0;
        //for second half of the ans array (concatenation)
        for(int j = nums.length ; j < ans.length ; j++){
            ans[j] = nums[a];
            a++;
        }
        
        return ans;
    }
}
