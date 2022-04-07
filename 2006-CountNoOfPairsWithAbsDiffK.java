//Question Link - https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        
        //2 for loops, increase count only when conditions are met
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                int n = Math.abs(nums[i] - nums[j]);
                if(n == k && i < j){
                    count++;
                }
            }
        }
        
        return count;
    }
}
