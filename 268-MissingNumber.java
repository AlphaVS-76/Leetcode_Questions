//Question Link - https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        //taking the 2 vars which keeps the sum of array length and sum of elements
        int arrsum = 0;
        int sum = nums.length;
        
        //for loop to get the respective sums
        for(int i=0 ; i<nums.length ; i++){
            arrsum += nums[i];
            sum += i;
        }
        
        //the missing number will be the difference
        return sum-arrsum;
    }
}
