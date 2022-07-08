//Question Link - https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/

class Solution {
    public int minPairSum(int[] nums) {
        //base case
        if(nums.length == 2){
            return nums[1]-nums[0];
        }
        
        int res = Integer.MIN_VALUE;
        
        Arrays.sort(nums);
        
        //formula derived from example
        for (int i = 0; i < nums.length/2 ; ++i){
            res = Math.max(res, nums[i] + nums[nums.length-i-1]);
        }
        
        return res;
    }
}
