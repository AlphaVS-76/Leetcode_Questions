//Question Link - https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/

class Solution {
    public int minMoves2(int[] nums) {
        //base case
        if(nums.length == 1){
            return 0;
        }
        
        Arrays.sort(nums);
        
        int sum = 0;
        int mid = nums[nums.length/2];
        
        //getting the median in the array and resizing every other element according to it
        for (int a: nums) {
            sum += Math.abs(mid-a);
        }
        
        return sum;
    }
}
