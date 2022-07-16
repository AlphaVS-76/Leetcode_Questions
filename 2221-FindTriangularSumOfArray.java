//Question Link - https://leetcode.com/problems/find-triangular-sum-of-an-array/

class Solution {
    public int triangularSum(int[] nums) {
        return find(nums, nums.length);
    }
    
    public int find(int[] nums, int len){
        if(len == 1){
            return nums[0];
        }
            
        for(int i = 0 ; i < len-1 ; i++){
            nums[i] = (nums[i] + nums[i+1]) % 10; 
        }
        
        return find(nums, len-1);
    }
}
