//Question Link - https://leetcode.com/problems/maximum-gap/

class Solution {
    public int maximumGap(int[] nums) {
        //base case
        if(nums.length < 2){
            return 0;
        }
        
        Arrays.sort(nums);
        int diff = 0;
        
        //getting the max diff of i and i-1 element
        for(int i = 1 ; i < nums.length ; i++){
            diff = Math.max(diff, nums[i]-nums[i-1]);
        }
        
        return diff;
    }
}
