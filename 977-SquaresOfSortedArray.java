//Question Link - https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        //square the elements and return the array
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] *= nums[i];
        }
        
        //sorting the array
        Arrays.sort(nums);
        
        return nums;
    }
}
