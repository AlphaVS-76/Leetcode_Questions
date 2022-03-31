//Question Link - https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            //replacing the sum with original elements
            nums[i] = sum;
        }
        
        return nums;
    }
}
