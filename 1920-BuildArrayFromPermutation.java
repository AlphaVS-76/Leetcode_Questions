//Question Link - https://leetcode.com/problems/build-array-from-permutation/

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        //base case
        if(nums.length <= 1){
            return ans;
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }
}
